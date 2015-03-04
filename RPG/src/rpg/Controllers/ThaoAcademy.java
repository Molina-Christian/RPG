/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

/**
 *
 * @author Fred and Karen Call
 */
public class ThaoAcademy {
    public static void talk(int where) {
        switch (where) {
            case 0:
                System.out.println("You are talking OUTSIDE");
                break;
            case 1:
                System.out.println("You are talking INSIDE");
                break;
            case 2:
                System.out.println("You are talking DORM");
                break;
            case 3:
                System.out.println("You are talking CAFE");
                break;
            case 4:
                System.out.println("You are talking TELEPORT");
                break;
        }
    }
    public static void goToClass() {
        
    }
    public static void eat() {
        
    }
    public static void room() {
        
    }
    public static void teleport() {
        
    }
}
