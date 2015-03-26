/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this turnOrderlate file, choose Tools | Templates
 * and open the turnOrderlate in the editor.
 */
package rpg.Controllers;
import java.util.Random;

//Accessing Database
import rpg.Models.Mob;

/**
 *
 * @author Christian
 */
public class Party {
    static Random roll = new Random();
    
    public Party() {
        
    }
    
    public Mob buildEncounter() {
        int which = roll.nextInt(Mob.mobs.length);
        return Mob.mobs[which];
    }
}
