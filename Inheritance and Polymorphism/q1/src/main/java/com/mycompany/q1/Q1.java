/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q1;
import java.util.Scanner;
/**
 *
 * @author hasnainsaleem
 */
public class Q1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name for Hourly Employe: ");
        String name1 = scanner.nextLine();
        
        System.out.print("Enter Hourly Rate for Hourly Employee: ");
        double HourlyRate = scanner.nextDouble();
        
        System.out.print("Enter Hours Worked for Hourly Employee: ");
        double HoursWorked = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.print("Enter name for Salaried Employe: ");
        String name2 = scanner.nextLine();
       
        System.out.print("Enter AnnualSalary for Salaried Employee: ");
        double AnnualSalary = scanner.nextDouble();
        
        Employee E1 = new HourlyEmployee(HourlyRate, HoursWorked, name1);
        Employee E2 = new SalariedEmployee(AnnualSalary, name2);
        
        E1.calcSalary();
        E2.calcSalary();
        
        scanner.close();
    }
}

//Shape.java
//public abstract class Shape {
//abstract void draw();
//}
//Rectangle.java
//public class Rectangle extends Shape{
//@Override
//void draw() {
//System.out.println("Drawing a shape");
//}
//}
//
//Main.java
//public class Main {
//public static void main(String[] args) {
//Rectangle r=new Rectangle();
//r.draw();
//}
//}


//Shape.java (Interface)
//public interface Shape {
//String name = "shape";
//void draw();
//}
//
//Rectangle.java (class)
//public class Rectangle implements Shape{
//@Override
//public void draw() {
//// name="Rectangle" error because by default the variables of interface are public static
//final
//System.out.println("Drawing rectangle");
//}
//}
//Main.java
//public class Main {
//public static void main(String[] args) {
//Rectangle r=new Rectangle();
//r.draw();
//}
//}
//Output:
//Drawing rectangle
//
//Multiple Inheritance using Interfaces
//
//interface1.java
//public interface interface1 {
//void foo1();
//}
//interface2.java
//public interface interface2 {
//void foo2();
//}
//MyClass.java
//public class MyClass implements interface1, interface2 {
//@Override
//public void foo1() {
//System.out.println("foo 1");
//}
//@Override
//public void foo2() {
//System.out.println("foo 2");
//}
//}
//
//Main.java
//public class Main {
//public static void main(String[] args) {
//MyClass c=new MyClass();
//c.foo1();
//c.foo2();
//}
//}
//
//Interface extending another interface implemented by a class
//
//Interface1.java
//public interface interface1 {
//void foo1();
//}
//interface2.java
//public interface interface2 extends interface1{
//void foo2();
//}
//MyClass.java
//public class MyClass implements interface2 {
//@Override
//public void foo1() {
//System.out.println("foo 1");
//}
//@Override
//public void foo2() {
//System.out.println("foo 2");
//}
//}
//
//Main.java
//public class Main {
//public static void main(String[] args) {
//MyClass c=new MyClass();
//c.foo1();
//c.foo2();
//}
//}