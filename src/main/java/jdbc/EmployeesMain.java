package jdbc;



import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.flywaydb.core.Flyway;


import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeesMain {

    /*
    felhasználó név: employees
    jelszó; employees
     */




    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);

        flyway.clean();
        flyway.migrate();

        EmployeesDao employeesDao = new EmployeesDao(dataSource);
        employeesDao.createEmployee("John Doe");

        List<String> names = employeesDao.listEmployeeNames();
        System.out.println(names);


        String name = employeesDao.findEmployeeNameById(1L);
        System.out.println(name);




    }
}


/*

        MySQLDataSource dataSource = new MySQLDataSource();  //a datasource kizárólag a kapcsolódási paramétereket tartalmazza
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

 */

    /*
//sima adat feltöltés

        try (
                Connection conn = dataSource.getConnection();                       //ez pedig kapcsolódik
                PreparedStatement stmt = conn.prepareStatement("insert into employees(emp_name) values (?)")) { // a kérdőjel egy sima helyettesítő karakter
                stmt.setString(1, "Jack Doe");                                      //sorszámozás 1-től kezdődik!!!
                stmt.executeUpdate();                                               //ez küldi el az adatokat az adatbázisnak
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert" + se);
        }
    }



     */

    /*
        //adatok lekérése
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select id, emp_name from employees")
        ) {
            while (rs.next()) {
                long id = rs.getLong("id");
                System.out.println(id);
                String name = rs.getString("emp_name");
                System.out.println(name);
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }

     */

    /*
//második anyag
//lekéri a neveket az adatbázisból csak az emp_name oszlopból
    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
               String name = rs.getString("emp_name");
               names.add(name);
            }
            System.out.println(names);

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }
}

     */


