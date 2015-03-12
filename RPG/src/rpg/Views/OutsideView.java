/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class OutsideView {
    private final static String[][] menuItems = {
        {"1.","Level Up"},
        {"2.","Battle"},
        {"3.","Go back"}
    };
    
    public static void getInput() {
        String command;
        Scanner input = new Scanner(System.in);
        
        do {
            OutsideView.display();
            
            command = input.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    AkashicTrials.hero.levelUp();
                    break;
                case "2":
                    BattleMenuView.initiate();
                    break;
                case "3":
                    return;
                case "M":
                    PauseMenuView.getInput();
                    break;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        }while (!command.equals("3"));
    }
    private static void display() {
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("Day: " + AkashicTrials.day + " Hour: " + AkashicTrials.time);
        System.out.println("**********************************************************************");
        System.out.println();
        for (String[] array : menuItems) {
            System.out.println("\t" + array[0] + "\t" + array[1]);
        }
        System.out.println();
        System.out.println("... ");
    }
}
