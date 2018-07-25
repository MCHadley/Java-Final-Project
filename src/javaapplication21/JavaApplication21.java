/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author michaelhadley
 */
public class JavaApplication21 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please choose a Wizard or Elf: ");
        
        Random rand = new Random();
        int h = rand.nextInt(10) + 1;
        
        int spellCost = 5;
        int arrowCost = 2;
        int amountSpent;
        int goldAmount;
        
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        String choice2;
//        Validate Entry
        if (!(choice.equalsIgnoreCase("Wizard") || (choice.equalsIgnoreCase("Elf")))){
            System.out.println("You have entered an invalid choice");
//      User chooses Wizard
        }else if(choice.equalsIgnoreCase("Wizard")){
            Wizard w = new Wizard();
            System.out.print("Please set a name: ");
            String nameChoice = sc.nextLine();
            w.setName(nameChoice);
            w.setGold(25);
            w.setHealth(h);
            System.out.print("Would you like to buy some spells?, one spell is 5 gold (Y/N): ");
            choice2 = sc.nextLine();
                while(choice2.equalsIgnoreCase("y")){
                    if(w.getGold() < 5){System.out.println("You don't have enough gold");}
                    else{
                        System.out.print("How many spells would you like to buy?: ");
                        int nextInt = sc.nextInt();
                        amountSpent = nextInt * spellCost;
                        w.setSpells(nextInt);
                        goldAmount = w.getGold();
                        w.setGold(goldAmount - amountSpent);
                        break;
                    }
                }
                System.out.println();
                System.out.println(w.toString());
//        User chooses Elf
        }else if(choice.equalsIgnoreCase("Elf")){
               Elf e = new Elf();
               System.out.print("Please set a name: ");
               String nameChoice = sc.nextLine();
               e.setName(nameChoice);
               e.setGold(25);
               e.setHealth(h);
               System.out.print("Would you like to buy some arrows?, one arrow is 2 gold (Y/N): ");
               choice2 = sc.nextLine();
               while(choice2.equalsIgnoreCase("y")){
                   if(e.getGold() < 2){System.out.print("You don't have enough gold.");}
                   else{
                       System.out.print("How many arrows would you like to buy?: ");
                       int nextInt = sc.nextInt();
                       amountSpent = nextInt * arrowCost;
                       e.setArrows(nextInt);
                       goldAmount = e.getGold();
                       e.setGold(goldAmount - amountSpent);
                       break;
                    }
                   
               }
               System.out.println();
               System.out.println(e.toString());
            }
        
        
   }
    
}
