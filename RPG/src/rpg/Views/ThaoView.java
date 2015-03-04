/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;

import rpg.Controllers.ThaoAcademy;

/**
 *
 * @author Fred and Karen Call
 */
public class ThaoView {
    private static int location;
    private final static String[][] OUTSIDE = {
        {"1.","Go Inside"},
        {"2.","Go to the Dorms"},
        {"3.","Talk"},
        {"4.","Leave the Academy"}
    };
    private final static String[][] INSIDE = {
        {"1.","Go to Class"},
        {"2.","Go to the Cafeteria"},
        {"3.","Go to the Teleporter"},
        {"4.","Talk"},
        {"5.","Go Outside"}
    };
    private final static String[][] DORM = {
        {"1.","Go to your Room"},
        {"2.","Talk"},
        {"3.","Leave the Dorms"}
    };
    private final static String[][] CAFE = {
        {"1.","Eat"},
        {"2.","Talk"},
        {"3.","Leave the Cafeteria"}
    };
    private final static String[][] TELEPORT = {
        {"1.","Use the Teleporter"},
        {"2.","Talk"},
        {"3.","Leave the Teleporter"}
    };
    static ThaoAcademy control = new ThaoAcademy();
    
    public static void getInput(int where) {
        String command;
        Scanner input = new Scanner(System.in);
        switch (where) {
            case 0:
                do {
                    ThaoView.display(where);

                    command = input.nextLine();
                    command = command.trim().toUpperCase();

                    switch (command) {
                        case "1":
                            location = 1;
                            ThaoView.getInput(location);
                            break;
                        case "2":
                            location = 2;
                            ThaoView.getInput(location);
                            break;
                        case "3":
                            control.talk(where);
                            continue;
                        case "4":
                            return;
                        case "M":
                            PauseMenuView.getInput();
                            break;
                        default:
                            System.out.println("Invalid command. Please enter a valid command.");
                    }
                }while(!command.equals("4"));
                break;
            case 1:
                do {
                    ThaoView.display(where);

                    command = input.nextLine();
                    command = command.trim().toUpperCase();

                    switch (command) {
                        case "1":
                            control.goToClass();
                            continue;
                        case "2":
                            location = 3;
                            ThaoView.getInput(location);
                            break;
                        case "3":
                            location = 4;
                            ThaoView.getInput(location);
                            break;
                        case "4":
                            control.talk(where);
                            continue;
                        case "5":
                            return;
                        case "M":
                            PauseMenuView.getInput();
                            break;
                        default:
                            System.out.println("Invalid command. Please enter a valid command.");
                    }
                }while(!command.equals("5"));
                break;
            case 2:
                do {
                    ThaoView.display(where);

                    command = input.nextLine();
                    command = command.trim().toUpperCase();

                    switch (command) {
                        case "1":
                            control.room();
                            continue;
                        case "2":
                            control.talk(where);
                            continue;
                        case "3":
                            return;
                        case "M":
                            PauseMenuView.getInput();
                            break;
                        default:
                            System.out.println("Invalid command. Please enter a valid command.");
                    }
                }while(!command.equals("3"));
                break;
            case 3:
                do {
                    ThaoView.display(where);

                    command = input.nextLine();
                    command = command.trim().toUpperCase();

                    switch (command) {
                        case "1":
                            control.eat();
                            continue;
                        case "2":
                            control.talk(where);
                            continue;
                        case "3":
                            return;
                        case "M":
                            PauseMenuView.getInput();
                            break;
                        default:
                            System.out.println("Invalid command. Please enter a valid command.");
                    }
                }while(!command.equals("3"));
                break;
            case 4:
                do {
                    ThaoView.display(where);

                    command = input.nextLine();
                    command = command.trim().toUpperCase();

                    switch (command) {
                        case "1":
                            control.teleport();
                            continue;
                        case "2":
                            control.talk(where);
                            continue;
                        case "3":
                            return;
                        case "M":
                            PauseMenuView.getInput();
                            break;
                        default:
                            System.out.println("Invalid command. Please enter a valid command.");
                    }
                }while(!command.equals("3"));
                break;
        }
    }
    private static void display(int where) {
        switch (where) {
            case 0:
                System.out.println();
                System.out.println("**********************************************************************");
                System.out.println("Day: " + AkashicTrials.day + " Hour: " + AkashicTrials.time);
                System.out.println("**********************************************************************");
                System.out.println();
                for (String[] array : OUTSIDE) {
                    System.out.println("\t" + array[0] + "\t" + array[1]);
                }
                System.out.println();
                System.out.println("... ");
                break;
            case 1:
                System.out.println();
                System.out.println("**********************************************************************");
                System.out.println("Day: " + AkashicTrials.day + " Hour: " + AkashicTrials.time);
                System.out.println("**********************************************************************");
                System.out.println();
                for (String[] array : INSIDE) {
                    System.out.println("\t" + array[0] + "\t" + array[1]);
                }
                System.out.println();
                System.out.println("... ");
                break;
            case 2:
                System.out.println();
                System.out.println("**********************************************************************");
                System.out.println("Day: " + AkashicTrials.day + " Hour: " + AkashicTrials.time);
                System.out.println("**********************************************************************");
                System.out.println();
                for (String[] array : DORM) {
                    System.out.println("\t" + array[0] + "\t" + array[1]);
                }
                System.out.println();
                System.out.println("... ");
                break;
            case 3:
                System.out.println();
                System.out.println("**********************************************************************");
                System.out.println("Day: " + AkashicTrials.day + " Hour: " + AkashicTrials.time);
                System.out.println("**********************************************************************");
                System.out.println();
                for (String[] array : CAFE) {
                    System.out.println("\t" + array[0] + "\t" + array[1]);
                }
                System.out.println();
                System.out.println("... ");
                break;
            case 4:
                System.out.println();
                System.out.println("**********************************************************************");
                System.out.println("Day: " + AkashicTrials.day + " Hour: " + AkashicTrials.time);
                System.out.println("**********************************************************************");
                System.out.println();
                for (String[] array : TELEPORT) {
                    System.out.println("\t" + array[0] + "\t" + array[1]);
                }
                System.out.println();
                System.out.println("... ");
                break;
        }
    }
}
