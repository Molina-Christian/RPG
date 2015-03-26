/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Event {
    Scanner input = new Scanner(System.in);
    
    public void forwardTime() {
        if (Game.time < 24) {
            Game.time++;
        } else if (Game.time >= 24) {
            Game.time = 1;
            Game.day++;
        }
    }
    
    public void eventTrue(int event) {
        if (this.checkTime(event) == true) {
            // start event
        }
    }
    
    public Boolean checkTime(int event) {
        switch (event) {
            default:
                break;
        }
        return false;
    }
}
