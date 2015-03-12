/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;
import rpg.Controllers.InventoryController;
import rpg.Controllers.MagicController;

/**
 *
 * @author Christian
 */
public class PauseMenuView {
    private final static String[][] menuItems = {
        {"1.","Items"},
        {"2.","Magic"},
        {"3.","Status"},
        {"4.","Save"},
        {"5.","Quit"},
        {"6.","Leave Menu"}
    };
    public static void getInput() {
        String command;
        Scanner input = new Scanner(System.in);
        
        do {
            PauseMenuView.display();
            command = input.nextLine();
            command = command.trim().toUpperCase();
            switch (command) {
                case "1": // Items
                    InventoryController.printInventory();
                    break;
                case "2": // Magic
                    MagicController.printMagic();
                    break;
                case "3": // Status
                    PauseMenuView.displayHero();
                    break;
                case "4": // Save
                    System.out.println("This is not available yet.");
                    break;
                case "5": // Quit
                    System.out.println("Are you sure you wish to quit? (Y/N)");
                    String quit = input.nextLine();
                    quit = quit.trim().toUpperCase();
                    if (quit.equals("Y")) {
                        System.exit(0);
                    }
                    break;
                case "6":
                    return;
            }
        }while(!command.equals("6"));
    }
    private static void display() {
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("**                           PAUSE MENU                             **");
        System.out.println("**********************************************************************");
        System.out.println();
        for (String[] array : menuItems) {
            System.out.println("\t" + array[0] + "\t" + array[1]);
        }
        System.out.println();
        System.out.println("... ");
    }

    private static void displayHero() {
        System.out.println();
        System.out.println(AkashicTrials.hero.firstName + " " + AkashicTrials.hero.lastName + " (" + AkashicTrials.hero.nickName + ")");
        System.out.println();
        System.out.println("Level: " + AkashicTrials.hero.level);
        System.out.println();
        System.out.println("EXP: " + AkashicTrials.hero.exp + "/" + AkashicTrials.hero.expTo);
        System.out.println();
        System.out.println("HP: " + AkashicTrials.hero.HP + "/" + AkashicTrials.hero.MAX_HP);
        System.out.println("MP: " + AkashicTrials.hero.MP + "/" + AkashicTrials.hero.MAX_MP);
        System.out.println();
        System.out.println("STR: " + AkashicTrials.hero.STR);
        System.out.println("CON: " + AkashicTrials.hero.CON);
        System.out.println("DEX: " + AkashicTrials.hero.DEX);
        System.out.println("INT: " + AkashicTrials.hero.INT);
        System.out.println("WIS: " + AkashicTrials.hero.WIS);
        System.out.println("LUC: " + AkashicTrials.hero.LUC);
        System.out.println();
        System.out.println("Affinity:");
        System.out.println("Air: " + AkashicTrials.hero.air);
        System.out.println("Earth: " + AkashicTrials.hero.earth);
        System.out.println("Fire: " + AkashicTrials.hero.fire);
        System.out.println("Water: " + AkashicTrials.hero.water);
    }
}
