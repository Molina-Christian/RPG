/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.Mobs;

/**
 *
 * @author Christian
 */
public class Mob extends Battler {
    public String NAME;
    
    public Mob(String name, int one, int two, int three, int four, int five, int six) {
        super (one, two, three, four, five, six);
        this.NAME = name;
    }
    
    //Accessing Database
    public static Mob[] mobs = new Mob[Mobs.NAME.length];
    
    public static void generateMobs() {
        for (int i=0; i<mobs.length;i++) {
            mobs[i] = new Mob(Mobs.NAME[i], Mobs.STR[i], Mobs.CON[i], Mobs.DEX[i], Mobs.INT[i], Mobs.WIS[i], Mobs.LUC[i]);
        }
    }
    
    public String getName() {
        return NAME;
    }
}
