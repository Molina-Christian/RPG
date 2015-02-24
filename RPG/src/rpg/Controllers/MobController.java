/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.MobModel;
import rpg.Databases.MobDatabase;

/**
 *
 * @author Christian
 */
public class MobController {
    //Accessing Database
    public static MobModel[] mobs = new MobModel[MobDatabase.NAME.length];
    
    public void generateMobs() {
        for (int i=0; i<mobs.length;i++) {
            mobs[i] = new MobModel(MobDatabase.NAME[i], MobDatabase.STR[i], MobDatabase.CON[i], MobDatabase.DEX[i], MobDatabase.INT[i], MobDatabase.WIS[i], MobDatabase.LUC[i]);
        }
    }
    public void printMobs() {
        for (int i = 0; i<mobs.length; i++) {
            System.out.println("Name: " + mobs[i].name);
            System.out.println("HP: " + mobs[i].hp + "/" + mobs[i].maxHp);
            System.out.println("MP: " + mobs[i].mp + "/" + mobs[i].maxMp);
            System.out.println("STR: " + mobs[i].strength);
            System.out.println("CON: " + mobs[i].constitution);
            System.out.println("DEX: " + mobs[i].dexterity);
            System.out.println("INT: " + mobs[i].intelligence);
            System.out.println("WIS: " + mobs[i].wisdom);
            System.out.println("LUC: " + mobs[i].luck);
            System.out.println();
        }
    }
}
