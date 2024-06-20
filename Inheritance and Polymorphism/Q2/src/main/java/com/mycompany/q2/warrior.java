/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2;

/**
 *
 * @author hasnainsaleem
 */
public class warrior extends character
{
    private int strength;

    public warrior(int strength, String name) 
    {
        super(name);
        this.strength = strength;
    }

    public int getStrength() 
    {
        return strength;
    }

    public void setStrength(int strength) 
    {
        this.strength = strength;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void attack() 
    {
        System.out.println(name + " attacks with strength " + strength);
    } 
}
