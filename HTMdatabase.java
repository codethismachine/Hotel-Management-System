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
      System.out.println("Employee table created successfully");
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
    System.out.println("Records inserted successfully");
     
  }
  public void readAllDataBase(){
      try {
      Class.forName("org.sqlite.JDBC");
      Connection c = DriverManager.getConnection("jdbc:sqlite:test.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      Statement stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM EMPLOYEE;" );
      while ( rs.next() ) {
         int id = rs.getInt("EMPLOYEE_ID");
         String  fname = rs.getString("FIRST_NAME");
         String  lname = rs.getString("LAST_NAME");
         int hireYear  = rs.getInt("HIRE_YEAR");
         int  hireMonth = rs.getInt("HIRE_MONTH");
         int  hireDay = rs.getInt("HIRE_DAY");
         int departmentID = rs.getInt("DEPARTMENT_ID");
         String username = rs.getString("USERNAME");
         String password = rs.getString("PASSWORD");
         System.out.println( "EMPOYEE ID = " + id );
         System.out.println( "FIRST NAME = " + fname );
         System.out.println( "LAST NAME = " + lname );
         System.out.println( "HIRE DATE = " + hireMonth + "/" + hireDay + "/" 
         + hireYear);
         System.out.println( "DEPARTEMENT ID = " + departmentID);
         System.out.println("USERNAME = " + username);
         System.out.println("PASSWORD = " + password);
         System.out.println();
      }
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
  }
   public void deleteRecord(int employeeID){
      try {
      Class.forName("org.sqlite.JDBC");
      Connection c = DriverManager.getConnection("jdbc:sqlite:test.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      Statement stmt = c.createStatement();
      String sql = "DELETE from EMPLOYEE where EMPLOYEE_ID="
              + employeeID + ";";
      stmt.executeUpdate(sql);
      c.commit();
      System.out.println("Cleared table successfully");
     
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
  }
}
