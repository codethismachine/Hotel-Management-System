/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;

/**
 *
 * @author Jason
 */
import java.sql.*;
public class HTMdatabase {
  private Connection connection; 
  private Statement statement; 
  
 
  
    /*private String firstName;
    private String lastName;
    private String hireYear;
    private String hireMonth;
    private String hireDay;
    private String departmentID;
    private int employeeID;
    private String username;
    private String password;*/
  public void createTable(){
      try { 
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:test.db");
      System.out.println("Opened database successfully");

      statement = connection.createStatement();
      String sql = "CREATE TABLE EMPLOYEE " +
                   "(EMPLOYEE_ID INT PRIMARY KEY     NOT NULL," +
                   " FIRST_NAME     VARCHAR    NOT NULL, " +
                   " LAST_NAME      VARCHAR    NOT NULL," +
                   " HIRE_YEAR           INT    NOT NULL, " +
                   " HIRE_MONTH          INT    NOT NULL, " +
                   " HIRE_DAY            INT    NOT NULL, " +
                   " DEPARTMENT_ID  INT        NOT NULL, " +
                   " USERNAME       VARCHAR, " + 
                   " PASSWORD       VARCHAR)";           
      
      statement.executeUpdate(sql);
      statement.close();
      connection.close();    
      }catch(Exception e){
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
      }
      System.out.println("Records created successfully");
  }
  
  public void insertTable(){
      
          try {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:test.db");
      connection.setAutoCommit(false);
      System.out.println("Opened database successfully");

      statement = connection.createStatement();
      String sql = "INSERT INTO EMPLOYEE (EMPLOYEE_ID, FIRST_NAME, LAST_NAME,"
              + "HIRE_YEAR, HIRE_MONTH, HIRE_DAY, DEPARTMENT_ID, USERNAME, "
              + "PASSWORD) " +
              "VALUES (9, 'Paul', 'Ryan', 2021, 1, 20, 0, 'P90X', 'GETFIT' );"; 
      statement.executeUpdate(sql);
      
      statement.close();
      connection.commit();
      connection.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
     
  }
}
