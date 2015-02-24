/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Main;
import java.util.Scanner;
import rpg.Controllers.PlayerController;

/**
 *
 * @author Christian
 */
public class EventController {
    Scanner input = new Scanner(System.in);
    
    public void forwardTime() {
        if (Main.time < 24) {
            Main.time++;
        } else if (Main.time >= 24) {
            Main.time = 1;
            Main.day++;
        }
    }
    
    public void eventTrue(int event) {
        if (this.checkTime(event) == true) {
            // start event
            System.out.println("I am an event at the 3rd hour!");
            PlayerController.players[0].affection++;
            System.out.println(PlayerController.players[0].nickName + ": " + PlayerController.players[0].affection + " love points");
            input.nextLine();
        }
    }
    
    public Boolean checkTime(int event) {
        switch (event) {
            case 1:
                // if the TIME == the right time
                if (Main.time == 3) {
                    return true;
                }
            default:
                break;
        }
        return false;
    }
}
