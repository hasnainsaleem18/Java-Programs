/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q2;
import java.util.Scanner;
/**
 *
 * @author hasnainsaleem
 */
public class Q2 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name of warrior: ");
        String name1 = scanner.nextLine();
        
        System.out.print("Enter strength of warrior: ");
        int strength = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Enter name of mage: ");
        String name2 = scanner.nextLine();
        
        System.out.print("Enter intelligence of mage: ");
        int intelligence = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Enter name of thieve: ");
        String name3 = scanner.nextLine();
        
        System.out.print("Enter agility of thieve: ");
        int agility = scanner.nextInt();

        warrior C1 = new warrior(strength, name1);
        mage C2 = new mage(intelligence, name2);
        thieve C3 = new thieve(agility, name3);
        
        C1.attack();
        C2.attack();
        C3.attack();
        
        
        
        scanner.close();
    }
}
