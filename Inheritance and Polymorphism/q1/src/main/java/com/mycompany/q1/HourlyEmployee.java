package com.mycompany.q1;

/**
 * The HourlyEmployee class represents an employee who is paid based on the number of hours worked.
 * It extends the Employee class and includes the hourly rate and hours worked.
 * This class provides methods to get and set the hourly rate and hours worked,
 * as well as to calculate the salary based on these attributes.
 * 
 * @see Employee
 * @see SalaryEmployee
 * 
 * @version 1.0
 * @since 2024-05-21
 * 
 * 
 */
public class HourlyEmployee extends Employee {
    private double HourlyRate;
    private double HoursWorked;

    /**
     * Constructs an HourlyEmployee with the specified hourly rate, hours worked, and employee name.
     * 
     * @param HourlyRate the hourly rate of the employee
     * @param HoursWorked the number of hours worked by the employee
     * @param EmployeeName the name of the employee
     */
    public HourlyEmployee(double HourlyRate, double HoursWorked, String EmployeeName) {
        super(EmployeeName);
        this.HourlyRate = HourlyRate;
        this.HoursWorked = HoursWorked;
    }

    /**
     * Gets the hourly rate of the employee.
     * 
     * @return the hourly rate of the employee
     */
    public double getHourlyRate() {
        return HourlyRate;
    }

    /**
     * Sets the hourly rate of the employee.
     * 
     * @param HourlyRate the new hourly rate of the employee
     */
    public void setHourlyRate(double HourlyRate) {
        this.HourlyRate = HourlyRate;
    }

    /**
     * Gets the number of hours worked by the employee.
     * 
     * @return the number of hours worked by the employee
     */
    public double getHoursWorked() {
        return HoursWorked;
    }

    /**
     * Sets the number of hours worked by the employee.
     * 
     * @param HoursWorked the new number of hours worked by the employee
     */
    public void setHoursWorked(double HoursWorked) {
        this.HoursWorked = HoursWorked;
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
     * Calculates the salary of the hourly employee and prints it along with the employee's name.
     * The salary is calculated as the product of the hours worked and the hourly rate.
     */
    public void calcSalary() {
        double salary = HoursWorked * HourlyRate;
        System.out.println("Employee Name is: " + EmployeeName + ". They are an hourly employee with a salary of " + salary);
    }
}
