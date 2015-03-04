/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Christian
 */
public class BattleController {
    Scanner input = new Scanner(System.in);
    static Random roll = new Random();
    private static int choice;
    private static int damage;
    public static Boolean run = false;
    public static Boolean[] playerDefend = new Boolean[PartyController.party.length];
    public static Boolean[] mobDefend = new Boolean[PartyController.mobs.length];
    
    public void playerAttack(int who) {
        System.out.println("Select a target...");
        for (int i=0;i<PartyController.mobs.length;i++) {
            if (PartyController.mobs[i] != null) {
                System.out.println((i+1) + ". " + PartyController.mobs[i]);
            }
        }
        choice = input.nextInt();
        for (;;) {
            if (choice <= PartyController.mobs.length) {
                if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                    damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                    if (damage < 0) {
                        System.out.println(PartyController.party[who-1] + " did no damage!");
                    } else {
                        PartyController.mobsNum[choice-1][0] -= damage;
                        System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                    }
                } else {
                    System.out.println(PartyController.party[who-1] + " missed...");
                }
                break;
            } else {
                System.out.println("That is not a choice...");
            }
        }
    }
    public void playerSkill(int who) {
        
    }
    public void playerDefend(int who) {
        PartyController.partyNum[who-1][8] *= 2;
        playerDefend[who-1] = true;
            
    }
    public void runAway() {
        int average1 = 0;
        for (int i=0;i<PartyController.party.length;i++) {
            average1 += PartyController.partyNum[i][8];
        }
        average1 = average1 / PartyController.party.length;
        int average2 = 0;
        for (int i=0;i<PartyController.mobs.length;i++) {
            average2 += PartyController.mobsNum[i][8];
        }
        average2 = average2 / PartyController.mobs.length;
        if (average1 >= average2) {
            run = true;
        } else {
            System.out.println("The enemy stopped you from escaping!");
        }
         
    }
    
    public static void mobAttack(int who) {
        choice = roll.nextInt(PartyController.party.length);
        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
            if (damage < 0) {
                System.out.println(PartyController.mobs[who-1] + " did no damage...");
            } else {
                PartyController.partyNum[choice][1] -= damage;
                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
            }
        } else {
            System.out.println(PartyController.mobs[who-1] + " missed...");
        }
    }
    public static void mobSkill(int who) {
        
    }
    public static void mobDefend(int who) {
        PartyController.mobsNum[who-1][8] *= 2;
        mobDefend[who-1] = true;
    }
}
