package com.mycompany.q1;

/**
 * The Employee class represents an employee with a name.
 * It provides methods to get and set the employee's name, and to calculate the salary.
 * 
 * @author hasnainsaleem
 */
public class Employee {

    /**
     *
     */
    protected String EmployeeName;

    /**
     * Constructs an Employee with the specified name.
     * 
     * @param EmployeeName the name of the employee
     */
    public Employee(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    /**
     * Gets the name of the employee.
     * 
     * @return the name of the employee
     */
    public String getEmployeeName() {
        return EmployeeName;
    }

    /**
     * Sets the name of the employee.
     * 
     * @param EmployeeName the new name of the employee
     */
    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    /**
     * Prints the employee's name to the console.
     * This method currently just prints the employee's name.
     */
    public void calcSalary() {
        System.out.println("Employee Name is: " + EmployeeName);
    }
}
