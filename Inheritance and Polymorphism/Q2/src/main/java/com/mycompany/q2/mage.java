/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2;

/**
 *
 * @author hasnainsaleem
 */
public class mage extends character
{
    private int intelligence;

    public mage(int intelligence, String name) 
    {
        super(name);
        this.intelligence = intelligence;
    }

    public int getIntelligence() 
    {
        return intelligence;
    }

    public void setIntelligence(int intelligence) 
    {
        this.intelligence = intelligence;
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
        System.out.println(name + " attacks with intelligence " + intelligence);
    }
}
