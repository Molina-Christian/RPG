/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.NPCDatabase;

/**
 *
 * @author Christian
 */
public class NPCModel {
    public String FIRSTNAME;
    public String LASTNAME;
    public String NICKNAME;
    public int AFFECTION;
    
    public NPCModel(String word, String word2, String word3) {
        this.FIRSTNAME = word;
        this.LASTNAME = word2;
        this.NICKNAME = word3;
    }
    
    public static NPCModel[] npc = new NPCModel[NPCDatabase.NAME.length];
    
    public void generateNPC() {
        for (int i=0;i<npc.length;i++) {
            npc[i] = new NPCModel(NPCDatabase.NAME[i][0], NPCDatabase.NAME[i][1], NPCDatabase.NAME[i][2]);
        }
    }
    
    public String getFirst() {
        return FIRSTNAME;
    }
    public String getLast() {
        return LASTNAME;
    }
    public String getNick() {
        return NICKNAME;
    }
    public int getAffect() {
        return AFFECTION;
    }
}
