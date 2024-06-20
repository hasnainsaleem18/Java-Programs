/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2;

/**
 *
 * @author hasnainsaleem
 */
public class thieve extends character
{
    private int agility;

    public thieve(int agility, String name) 
    {
        super(name);
        this.agility = agility;
    }

    public int getAgility() 
    {
        return agility;
    }

    public void setAgility(int agility) 
    {
        this.agility = agility;
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
        System.out.println(name + " attacks with agility " + agility);
    }
    
    
    
}

