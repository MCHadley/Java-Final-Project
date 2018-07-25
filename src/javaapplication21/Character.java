/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author michaelhadley
 */
public class Character {
    
    private String name;
    private int gpAmt;
    private int health;
    
    
    public Character(){
        name = "";
        gpAmt = 0;
        health = 0;
    
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setGold(int gpAmt){
        this.gpAmt = gpAmt;
    }
    
    public int getGold(){
        return gpAmt;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public int getHealth(){
        return health;
    }
    
   
    
    @Override
    public String toString(){
        return "Your name is: " + name + "\n" + "You have " + gpAmt + " gold" + "\n" + "Your health is at: " + health;
    }
    
}
