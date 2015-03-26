/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

/**
 *
 * @author Christian
 */
public class World {
    String talk;
    public String getTalk(int where) {
        switch (where) {
            case 0:
                talk = "\n\nI am talking at the Cave of Darkness.";
                break;
        }
        return talk;
    }
    
}
