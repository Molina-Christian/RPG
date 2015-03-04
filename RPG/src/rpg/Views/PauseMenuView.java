/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;
import rpg.Controllers.InventoryController;
import rpg.Controllers.MagicController;
import rpg.Controllers.PartyController;

/**
 *
 * @author Fred and Karen Call
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
                    PartyController.displayCurrentParty();
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
}
