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
public class Employee {
    private final int EMPLOYEE_ID;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String HIRE_YEAR;
    private final String HIRE_MONTH;
    private final String HIRE_DAY;
    private final String DEPARTMENT_ID;
    private final String USERNAME;
    private final String PASSWORD;
    

    
    public Employee(int EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME,
            String HIRE_YEAR, String HIRE_MONTH, String HIRE_DAY, 
            String DEPARTMENT_ID, String USERNAME, String PASSWORD){
        
        this.EMPLOYEE_ID = EMPLOYEE_ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.HIRE_YEAR = HIRE_YEAR;
        this.HIRE_MONTH = HIRE_MONTH;
        this.HIRE_DAY = HIRE_DAY;
        this.DEPARTMENT_ID = DEPARTMENT_ID;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }
}
