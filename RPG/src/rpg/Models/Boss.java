/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.Bosses;

/**
 *
 * @author Christian
 */
public class Boss {
    public String name;
    public int strength;
    public int constitution;
    public int dexterity;
    public int intelligence;
    public int wisdom;
    public int luck;
    
    public Boss(String name, int str, int con, int dex, int Int, int wis, int luc) {
        this.name = name;
        this.strength = str;
        this.constitution = con;
        this.dexterity = dex;
        this.intelligence = Int;
        this.wisdom = wis;
        this.luck = luc;
    }
    
    //Accessing Database
    public static Boss[] bosses = new Boss[Bosses.NAME.length];
    
    public static void generateBosses() {
        for (int i=0; i<bosses.length;i++) {
            bosses[i] = new Boss(Bosses.NAME[i], Bosses.STR[i], Bosses.CON[i], Bosses.DEX[i], Bosses.INT[i], Bosses.WIS[i], Bosses.LUC[i]);
        }
    }
}
