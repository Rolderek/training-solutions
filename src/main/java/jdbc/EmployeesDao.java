package jdbc;

import javax.sql.DataSource;

import java.sql.*;
import java.util.ArrayList;

import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private long getIdByStatement(PreparedStatement stmt) { //alatta van a metódus ami használja
        try (
                ResultSet rs = stmt.getGeneratedKeys()
        )
        {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new IllegalStateException("Cannot get id");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot get id", se);
        }
    }

    public Long createEmployee(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into employees(emp_name) values (?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.executeUpdate();

            return getIdByStatement(stmt);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

    public List<String> listEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees order by emp_name")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }

    public String findEmployeeNameById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?");
        ) {
            ps.setLong(1, id); // a paraméterül kapott id-t keresi meg nem pedig beégetett adatot

            return selectNameByPreparedStatement(ps);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query", se);
        }
    }


    private String selectNameByPreparedStatement(PreparedStatement ps) {
        try  (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                return name;
            }
            throw new IllegalArgumentException("Not found"); //ha nem talál ilyen azonosítóval semmit akkor ezt írja ki, nekünk könnyebség
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query", se);
        }
    }

    //ACID
    public void createEmployees(List<String> names) {
        try ( Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false); // ez teszi lehetővé hogy ne minden egyes utasítás után legyen commit, hanem egy blokkban legyen ami ez után van

            try( PreparedStatement stmt = conn.prepareStatement("insert into employees(emp_name) values (?)")) {
                for (String name: names) {
                    if (name.startsWith("x")) {
                        throw new IllegalArgumentException("Invalid name");
                    }
                    stmt.setString(1, name);
                    stmt.executeUpdate();
                }
                conn.commit(); //itt hajtódik végre a ranzakció és a mentés
            }
            catch (IllegalArgumentException iae) { //ha a megadott feltétel hibára fut akkor kell rollback, ilyenkor az összes tétel nem kerül beszúrásra nem csak a hibás tételek nem
                conn.rollback();
            }
        }catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }


    }
}


