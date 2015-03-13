/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.MobDatabase;

/**
 *
 * @author Christian
 */
public class MobModel extends Battler {
    public String NAME;
    
    public MobModel(String name, int one, int two, int three, int four, int five, int six) {
        super (one, two, three, four, five, six);
        this.NAME = name;
    }
    
    //Accessing Database
    public static MobModel[] mobs = new MobModel[MobDatabase.NAME.length];
    
    public static void generateMobs() {
        for (int i=0; i<mobs.length;i++) {
            mobs[i] = new MobModel(MobDatabase.NAME[i], MobDatabase.STR[i], MobDatabase.CON[i], MobDatabase.DEX[i], MobDatabase.INT[i], MobDatabase.WIS[i], MobDatabase.LUC[i]);
        }
    }
    
    public String getName() {
        return NAME;
    }
}
