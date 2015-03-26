/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.NPC;

/**
 *
 * @author Christian
 */
public class npc {
    public static void incAffection(NPC who) {
        who.AFFECTION++;
    }
    public static void decAffection(NPC who) {
        who.AFFECTION--;
    }
}
