/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author hasnainsaleem
 */
public class SalariedEmployee extends Employee
{
    private double AnnualSalary;

    /**
     *
     * @param AnnualSalary
     * @param EmployeeName
     */
    public SalariedEmployee(double AnnualSalary, String EmployeeName) 
    {
        super(EmployeeName);
        this.AnnualSalary = AnnualSalary;
    }

    /**
     *
     * @return
     */
    public double getAnnualSalary() 
    {
        return AnnualSalary;
    }

    /**
     *
     * @param AnnualSalary
     */
    public void setAnnualSalary(double AnnualSalary) 
    {
        this.AnnualSalary = AnnualSalary;
    }

    /**
     *
     * @return
     */
    public String getEmployeeName() 
    {
        return EmployeeName;
    }

    /**
     *
     * @param EmployeeName
     */
    public void setEmployeeName(String EmployeeName) 
    {
        this.EmployeeName = EmployeeName;
    }

    /**
     *
     */
    public void calcSalary() 
    {
        double salary = AnnualSalary / 12;
        System.out.println("Employee Name is: " + EmployeeName + ". He is a Salaried Employee with " + salary + " salary");
    }
    
    
    
    
    
}
