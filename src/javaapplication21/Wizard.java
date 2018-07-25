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
public class Wizard extends Character {
    
    private int spells;
  
    
    public Wizard(){
        super();
        spells = 0;
    }
    
    public void setSpells(int spells){
        this.spells = spells;
    }
    
    public int getSpells(){
        return spells;
    }
    

    
    @Override
    public String toString(){
        return super.toString() + "\nYou have: " + spells + " spells left";
    }
    
}
