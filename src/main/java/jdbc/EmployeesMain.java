package jdbc;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.flywaydb.core.Flyway;

import java.util.List;

public class EmployeesMain {

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);

        flyway.clean();
        flyway.migrate();
/*
        EmployeesDao employeesDao = new EmployeesDao(dataSource);
        employeesDao.createEmployee("Jane Doe");

        List<String> names = employeesDao.listEmployeeNames();
        System.out.println(names);

        String name = employeesDao.findEmployeeNameById(1L);
        System.out.println(name);

 */
    }
}

/*
        //a datasource kizárólag a kapcsolódási paramétereket tartalmazza
        MySQLDataSource dataSource = new MySQLDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

sima adat feltöltés

        try (
                //ez pedig kapcsolódik
                Connection conn = dataSource.getConnection();
                // a kérdőjel egy sima helyettesítő karakter
                PreparedStatement stmt = conn.prepareStatement("insert into employees(emp_name) values (?)")) {
            //sorszámozás 1-től kezdődik!!!
                stmt.setString(1, "Jack Doe");
                //ez küldi el az adatokat az adatbázisnak
                stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert" + se);
        }
    }

 */
        /*
        adatok lekérése


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
