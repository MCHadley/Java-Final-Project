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
public class Elf extends Character {
    
    private int arrows;
    
    public Elf(){
        super();
        arrows = 0;
    }
    
    public void setArrows(int arrows){
        this.arrows = arrows;
    }
    
    public int getArrows(){
        return arrows;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nYou have " + arrows + " arrows left";
    }
    
}
