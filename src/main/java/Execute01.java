import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.Step:Registration to the driver
              // Class.forName("org.postgresql.driver");//this is not necessary since JDBC 4


//2.step:create connection to database

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");


        //3. Step: Create Statement

      Statement statement=  connection.createStatement();


        //4. Step: Execute query
    //    statement .execute("CREATE TABLE workers(worker_id VARCHAR(20), worker_name VARCHAR(50), worker_salary INT);");
  //this not recommended put query directly

String sql1="CREATE TABLE workers(worker_id VARCHAR(20), worker_name VARCHAR(50), worker_salary INT)";

statement.execute(sql1);

    }







            }











