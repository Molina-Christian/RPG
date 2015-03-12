/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Views.AkashicTrials;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class EventController {
    Scanner input = new Scanner(System.in);
    
    public void forwardTime() {
        if (AkashicTrials.time < 24) {
            AkashicTrials.time++;
        } else if (AkashicTrials.time >= 24) {
            AkashicTrials.time = 1;
            AkashicTrials.day++;
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
