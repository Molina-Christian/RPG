/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.NPCs;

/**
 *
 * @author Christian
 */
public class NPC {
    public String FIRSTNAME;
    public String LASTNAME;
    public String NICKNAME;
    public int AFFECTION;
    
    public NPC(String word, String word2, String word3) {
        this.FIRSTNAME = word;
        this.LASTNAME = word2;
        this.NICKNAME = word3;
    }
    
    public static NPC[] npc = new NPC[NPCs.NAME.length];
    
    public void generateNPC() {
        for (int i=0;i<npc.length;i++) {
            npc[i] = new NPC(NPCs.NAME[i][0], NPCs.NAME[i][1], NPCs.NAME[i][2]);
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
