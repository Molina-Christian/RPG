/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.BossModel;
import rpg.Databases.BossDatabase;

/**
 *
 * @author Christian
 */
public class BossController {
    //Accessing Database
    public static BossModel[] bosses = new BossModel[BossDatabase.NAME.length];
    
    public void generateBosses() {
        for (int i=0; i<bosses.length;i++) {
            bosses[i] = new BossModel(BossDatabase.NAME[i], BossDatabase.STR[i], BossDatabase.CON[i], BossDatabase.DEX[i], BossDatabase.INT[i], BossDatabase.WIS[i], BossDatabase.LUC[i]);
        }
    }
    public void printBosses() {
        for (int i = 0; i<bosses.length; i++) {
            System.out.println("Name: " + bosses[i].name);
            System.out.println("STR: " + bosses[i].strength);
            System.out.println("CON: " + bosses[i].constitution);
            System.out.println("DEX: " + bosses[i].dexterity);
            System.out.println("INT: " + bosses[i].intelligence);
            System.out.println("WIS: " + bosses[i].wisdom);
            System.out.println("LUC: " + bosses[i].luck);
            System.out.println();
        }
    }
}
