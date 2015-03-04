/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this turnOrderlate file, choose Tools | Templates
 * and open the turnOrderlate in the editor.
 */
package rpg.Controllers;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.*;

//Accessing Database
import rpg.Databases.PlayerDatabase;
import rpg.Databases.MobDatabase;
import rpg.Models.PlayerModel;
import rpg.Views.AkashicTrials;

/**
 *
 * @author Christian
 */
public class PartyController {
    Scanner input = new Scanner(System.in);
    public static String[][] party = new String[1][3];
    public static int[][] partyNum = new int[1][22];
    public static String[] mobs = new String[6];
    public static int[][] mobsNum = new int[6][9];
    public static int[] turnOrder = new int[10];
    public static int[] temp = new int[10];
    
    public PartyController(PlayerModel hero) { 
        party[0][0] = hero.firstName;
        party[0][1] = hero.lastName;
        party[0][2] = hero.nickName;
        partyNum[0][0] = hero.hp;
        partyNum[0][1] = hero.maxHp;
        partyNum[0][2] = hero.mp;
        partyNum[0][3] = hero.maxMp;
        partyNum[0][4] = hero.atk;
        partyNum[0][5] = hero.def;
        partyNum[0][6] = hero.mAtk;
        partyNum[0][7] = hero.mDef;
        partyNum[0][8] = hero.spd;
        partyNum[0][9] = hero.level;
        partyNum[0][10] = hero.exp;
        partyNum[0][11] = hero.expTo;
        partyNum[0][12] = hero.str;
        partyNum[0][13] = hero.con;
        partyNum[0][14] = hero.dex;
        partyNum[0][15] = hero.Int;
        partyNum[0][16] = hero.wis;
        partyNum[0][17] = hero.luc;
        partyNum[0][18] = hero.fire;
        partyNum[0][19] = hero.earth;
        partyNum[0][20] = hero.air;
        partyNum[0][21] = hero.water;
    }
    
    public static void displayCurrentParty() {
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("**                             STATUS                               **");
        System.out.println("**********************************************************************");
        System.out.println();
        for (int i=0;i<PartyController.party.length;i++) {
            if (party[i] != null) {
                System.out.println(party[i][0] + " " + party[i][1] + " (" + party[i][2] + ")");
                System.out.println("HP:\t" + partyNum[i][0] + "/" + partyNum[i][1]);
                System.out.println("MP:\t" + partyNum[i][2] + "/" + partyNum[i][3]);
                System.out.println();
                System.out.println("Level:\t" + partyNum[i][9]);
                System.out.println("Exp:\t" + partyNum[i][10] + "/" + partyNum[i][11]);
                System.out.println();
                System.out.println("STR: " + partyNum[i][12]);
                System.out.println("CON: " + partyNum[i][13]);
                System.out.println("DEX: " + partyNum[i][14]);
                System.out.println("INT: " + partyNum[i][15]);
                System.out.println("WIS: " + partyNum[i][16]);
                System.out.println("LUC: " + partyNum[i][17]);
                System.out.println();
                System.out.println("ATK:\t" + partyNum[i][4]);
                System.out.println("DEF:\t" + partyNum[i][5]);
                System.out.println("mATK:\t" + partyNum[i][6]);
                System.out.println("mDEF:\t" + partyNum[i][7]);
                System.out.println("SPD:\t" + partyNum[i][8]);
                System.out.println();
                System.out.println("AFFINITY:");
                System.out.println("Fire:\t" + partyNum[i][18]);
                System.out.println("Earth:\t" + partyNum[i][19]);
                System.out.println("Wind:\t" + partyNum[i][20]);
                System.out.println("Water:\t" + partyNum[i][21]);
                System.out.println();
            }
        }
    }
    public void swapCharacters() {
        System.out.println("Please select the character to switch...");
        for (int i=0;i<4;i++) {
            if (party[i][0] != null) {
                System.out.println((i+1) + ". " + party[i][0]);
            }
        }
        int choice = input.nextInt();
        int choice2;
        Boolean done = false;
        while (!done) {
            System.out.println("Replace with who?");
            for (int i=0;i<PlayerDatabase.NAME.length;i++) {
                System.out.println((i+1) + ": " + PlayerDatabase.NAME[i]);
            }
            choice2 = input.nextInt();
            while (!done) {
                if (choice2 <= PlayerDatabase.NAME.length) {
                    party[choice-1][0] = PlayerDatabase.NAME[choice2-1][0];
                    party[choice-1][1] = PlayerDatabase.NAME[choice2-1][1];
                    party[choice-1][2] = PlayerDatabase.NAME[choice2-1][2];
                    partyNum[choice-1][0] = PlayerController.players[choice2-1].hp;
                    partyNum[choice-1][1] = PlayerController.players[choice2-1].maxHp;
                    partyNum[choice-1][2] = PlayerController.players[choice2-1].mp;
                    partyNum[choice-1][3] = PlayerController.players[choice2-1].maxMp;
                    partyNum[choice-1][4] = PlayerController.players[choice2-1].atk;
                    partyNum[choice-1][5] = PlayerController.players[choice2-1].def;
                    partyNum[choice-1][6] = PlayerController.players[choice2-1].mAtk;
                    partyNum[choice-1][7] = PlayerController.players[choice2-1].mDef;
                    partyNum[choice-1][9] = PlayerController.players[choice2-1].spd;
                    done = true;
                } else {
                    System.out.println("Invalid choice. Please enter a correct choice.");
                }
            }
        }
    }
    public void buildEncounter() {
        Random roll = new Random();
        int encounter = roll.nextInt(6) + 1;
        for (int i=0;i<encounter;i++) {
            int which = roll.nextInt(MobDatabase.NAME.length);
            mobs[i] = MobDatabase.NAME[which];
            mobsNum[i][0] = MobController.mobs[which].hp;
            mobsNum[i][1] = MobController.mobs[which].maxHp;
            mobsNum[i][2] = MobController.mobs[which].mp;
            mobsNum[i][3] = MobController.mobs[which].maxMp;
            mobsNum[i][4] = MobController.mobs[which].atk;
            mobsNum[i][5] = MobController.mobs[which].def;
            mobsNum[i][6] = MobController.mobs[which].mAtk;
            mobsNum[i][7] = MobController.mobs[which].mDef;
            mobsNum[i][8] = MobController.mobs[which].spd;
        }
    }
    public void setTurnOrder() {
        for (int i=0;i<4;i++) {
            if (partyNum[i][8] != 0) {
                temp[i] = partyNum[i][8];
            }
        }
        int j=0;
        for (int i=4;i<10;i++) {
            if (mobsNum[j][8] != 0) {
                temp[i] = mobsNum[j][8];
                j++;
            }
        }
        for (int i=0;i<temp.length;i++) {
            System.out.println(temp[i]);
        }
        System.out.println();
        Arrays.sort(temp);
        int g=0;
        for (int i=9;i>0;i--) {
            turnOrder[g] = temp[i];
            g++;
        }
        for (int i=0;i<turnOrder.length;i++) {
            System.out.println(turnOrder[i]);
        }
    }
}
