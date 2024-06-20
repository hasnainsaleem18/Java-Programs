/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author hasnainsaleem
 */
public class MyFlyingBoat implements FlyingBoat 
{
    public void swimAndFly()
    {
        swim();
        fly();
    }
    public void swim()
    {
        System.out.println("flying boat is swimming");
    }
    
    public void fly()
    {
        System.out.println("flying boat is flying");
    }
    
}
