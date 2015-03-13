/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;
import rpg.Controllers.InventoryController;
import rpg.Models.MagicModel;

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
                    MagicModel.displayMagic();
                    break;
                case "3": // Status
                    PauseMenuView.displayHero();
                    break;
                case "4": // Save
                    System.out.println();
                    System.out.println("**********************************************************************");
                    System.out.println("**                               SAVE                               **");
                    System.out.println("**********************************************************************");
                    System.out.println();
                    System.out.println("This is not available yet.");
                    break;
                case "5": // Quit
                    System.out.println();
                    System.out.println("**********************************************************************");
                    System.out.println("**                               QUIT                               **");
                    System.out.println("**********************************************************************");
                    System.out.println();
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
        System.out.println("**********************************************************************");
        System.out.println("**                              STATUS                              **");
        System.out.println("**********************************************************************");
        System.out.println();
        System.out.println(AkashicTrials.hero.getFirst() + " " + AkashicTrials.hero.getLast() + " (" + AkashicTrials.hero.getNick() + ")");
        System.out.println();
        System.out.println("Level: " + AkashicTrials.hero.getLvl());
        System.out.println();
        System.out.println("EXP: " + AkashicTrials.hero.getEXP() + "/" + AkashicTrials.hero.getExpTo());
        System.out.println();
        System.out.println("HP: " + AkashicTrials.hero.getHP() + "/" + AkashicTrials.hero.getMaxHP());
        System.out.println("MP: " + AkashicTrials.hero.getMP() + "/" + AkashicTrials.hero.getMaxMP());
        System.out.println();
        System.out.println("STR: " + AkashicTrials.hero.getSTR());
        System.out.println("CON: " + AkashicTrials.hero.getCON());
        System.out.println("DEX: " + AkashicTrials.hero.getDEX());
        System.out.println("INT: " + AkashicTrials.hero.getINT());
        System.out.println("WIS: " + AkashicTrials.hero.getWIS());
        System.out.println("LUC: " + AkashicTrials.hero.getLUC());
        System.out.println();
        System.out.println("Affinity:");
        System.out.println("Air: " + AkashicTrials.hero.getAir());
        System.out.println("Earth: " + AkashicTrials.hero.getEarth());
        System.out.println("Fire: " + AkashicTrials.hero.getFire());
        System.out.println("Water: " + AkashicTrials.hero.getWater());
    }
}
