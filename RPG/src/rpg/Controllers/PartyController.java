/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this turnOrderlate file, choose Tools | Templates
 * and open the turnOrderlate in the editor.
 */
package rpg.Controllers;
import java.util.Random;

//Accessing Database
import rpg.Models.MobModel;

/**
 *
 * @author Christian
 */
public class PartyController {
    static Random roll = new Random();
    public static MobModel[] party = new MobModel[1];
    
    PartyController() {
        
    }
    
    public static void buildEncounter() {
        int which = roll.nextInt(MobModel.mobs.length);
        party[0] = MobModel.mobs[which];
    }
    
    public static void refresh() {
        for (MobModel mob : party) {
            mob.HP = mob.MAX_HP;
            mob.MP = mob.MAX_MP;
        }
    }
}
