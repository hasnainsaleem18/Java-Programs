/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.q1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hasnainsaleem
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//        System.out.println("j");
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of getEmployeeName method, of class Employee.
     */
    @org.junit.jupiter.api.Test
    public void testGetEmployeeName() {
        System.out.println("getEmployeeName");
        Employee instance = null;
        String expResult = "";
        String result = instance.getEmployeeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeName method, of class Employee.
     */
    @org.junit.jupiter.api.Test
    public void testSetEmployeeName() {
        System.out.println("setEmployeeName");
        String EmployeeName = "";
        Employee instance = null;
        instance.setEmployeeName(EmployeeName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcSalary method, of class Employee.
     */
    @org.junit.jupiter.api.Test
    public void testCalcSalary() {
        System.out.println("calcSalary");
        Employee instance = null;
        instance.calcSalary();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
