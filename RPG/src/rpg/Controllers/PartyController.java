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

/**
 *
 * @author Christian
 */
public class PartyController {
    Scanner input = new Scanner(System.in);
    public static String[] party = new String[4];
    public static int[][] partyNum = new int[4][9];
    public static String[] mobs = new String[6];
    public static int[][] mobsNum = new int[6][9];
    public static int[] turnOrder = new int[10];
    public static int[] temp = new int[10];
    
    public PartyController(PlayerModel hero) { 
        party[0] = hero.nickName;
        partyNum[0][0] = hero.hp;
        partyNum[0][1] = hero.maxHp;
        partyNum[0][2] = hero.mp;
        partyNum[0][3] = hero.maxMp;
    }
    
    public void displayCurrentParty() {
        for (int i=0;i<4;i++) {
            System.out.println(party[i]);
            System.out.println("HP: " + partyNum[i][0] + "/" + partyNum[i][1]);
            System.out.println("MP: " + partyNum[i][2] + "/" + partyNum[i][3]);
            System.out.println();
        }
        System.out.println();
    }
    public void swapCharacters() {
        System.out.println("Please select the character to switch...");
        for (int i=0;i<4;i++) {
            if (party[i] != null) {
                System.out.println((i+1) + ". " + party[i]);
            }
        }
        int choice = input.nextInt();
        int choice2;
        Boolean done = false;
        while (!done) {
            switch (choice) {
                case 1:
                    System.out.println("Replace with who?");
                    for (int i=0;i<PlayerDatabase.NAME.length;i++) {
                        System.out.println((i+1) + ": " + PlayerDatabase.NAME[i]);
                    }
                    choice2 = input.nextInt();
                    while (!done) {
                        switch (choice2) {
                            case 1:
                                party[0] = PlayerDatabase.NAME[0][2];
                                partyNum[0][0] = PlayerController.players[0].hp;
                                partyNum[0][1] = PlayerController.players[0].maxHp;
                                partyNum[0][2] = PlayerController.players[0].mp;
                                partyNum[0][3] = PlayerController.players[0].maxMp;
                                done = true;
                                break;
                            case 2:
                                party[0] = PlayerDatabase.NAME[1][0];
                                partyNum[0][0] = PlayerController.players[1].hp;
                                partyNum[0][1] = PlayerController.players[1].maxHp;
                                partyNum[0][2] = PlayerController.players[1].mp;
                                partyNum[0][3] = PlayerController.players[1].maxMp;
                                done = true;
                                break;
                            case 3:
                                party[0] = PlayerDatabase.NAME[2][0];
                                partyNum[0][0] = PlayerController.players[2].hp;
                                partyNum[0][1] = PlayerController.players[2].maxHp;
                                partyNum[0][2] = PlayerController.players[2].mp;
                                partyNum[0][3] = PlayerController.players[2].maxMp;
                                done = true;
                                break;
                            case 4:
                                party[0] = PlayerDatabase.NAME[3][0];
                                partyNum[0][0] = PlayerController.players[3].hp;
                                partyNum[0][1] = PlayerController.players[3].maxHp;
                                partyNum[0][2] = PlayerController.players[3].mp;
                                partyNum[0][3] = PlayerController.players[3].maxMp;
                                done = true;
                                break;
                            case 5:
                                party[0] = PlayerDatabase.NAME[4][0];
                                partyNum[0][0] = PlayerController.players[4].hp;
                                partyNum[0][1] = PlayerController.players[4].maxHp;
                                partyNum[0][2] = PlayerController.players[4].mp;
                                partyNum[0][3] = PlayerController.players[4].maxMp;
                                done = true;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Replace with who?");
                    for (int i=0;i<PlayerDatabase.NAME.length;i++) {
                        System.out.println((i+1) + ": " + PlayerDatabase.NAME[i]);
                    }
                    choice2 = input.nextInt();
                    while (!done) {
                        switch (choice2) {
                            case 1:
                                party[1] = PlayerDatabase.NAME[0][2];
                                partyNum[1][0] = PlayerController.players[0].hp;
                                partyNum[1][1] = PlayerController.players[0].maxHp;
                                partyNum[1][2] = PlayerController.players[0].mp;
                                partyNum[1][3] = PlayerController.players[0].maxMp;
                                done = true;
                                break;
                            case 2:
                                party[1] = PlayerDatabase.NAME[1][0];
                                partyNum[1][0] = PlayerController.players[1].hp;
                                partyNum[1][1] = PlayerController.players[1].maxHp;
                                partyNum[1][2] = PlayerController.players[1].mp;
                                partyNum[1][3] = PlayerController.players[1].maxMp;
                                done = true;
                                break;
                            case 3:
                                party[1] = PlayerDatabase.NAME[2][0];
                                partyNum[1][0] = PlayerController.players[2].hp;
                                partyNum[1][1] = PlayerController.players[2].maxHp;
                                partyNum[1][2] = PlayerController.players[2].mp;
                                partyNum[1][3] = PlayerController.players[2].maxMp;
                                done = true;
                                break;
                            case 4:
                                party[1] = PlayerDatabase.NAME[3][0];
                                partyNum[1][0] = PlayerController.players[3].hp;
                                partyNum[1][1] = PlayerController.players[3].maxHp;
                                partyNum[1][2] = PlayerController.players[3].mp;
                                partyNum[1][3] = PlayerController.players[3].maxMp;
                                done = true;
                                break;
                            case 5:
                                party[1] = PlayerDatabase.NAME[4][0];
                                partyNum[1][0] = PlayerController.players[4].hp;
                                partyNum[1][1] = PlayerController.players[4].maxHp;
                                partyNum[1][2] = PlayerController.players[4].mp;
                                partyNum[1][3] = PlayerController.players[4].maxMp;
                                done = true;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Replace with who?");
                    for (int i=0;i<PlayerDatabase.NAME.length;i++) {
                        System.out.println((i+1) + ": " + PlayerDatabase.NAME[i]);
                    }
                    choice2 = input.nextInt();
                    while (!done) {
                        switch (choice2) {
                            case 1:
                                party[2] = PlayerDatabase.NAME[0][2];
                                partyNum[2][0] = PlayerController.players[0].hp;
                                partyNum[2][1] = PlayerController.players[0].maxHp;
                                partyNum[2][2] = PlayerController.players[0].mp;
                                partyNum[2][3] = PlayerController.players[0].maxMp;
                                done = true;
                                break;
                            case 2:
                                party[2] = PlayerDatabase.NAME[1][0];
                                partyNum[2][0] = PlayerController.players[1].hp;
                                partyNum[2][1] = PlayerController.players[1].maxHp;
                                partyNum[2][2] = PlayerController.players[1].mp;
                                partyNum[2][3] = PlayerController.players[1].maxMp;
                                done = true;
                                break;
                            case 3:
                                party[2] = PlayerDatabase.NAME[2][0];
                                partyNum[2][0] = PlayerController.players[2].hp;
                                partyNum[2][1] = PlayerController.players[2].maxHp;
                                partyNum[2][2] = PlayerController.players[2].mp;
                                partyNum[2][3] = PlayerController.players[2].maxMp;
                                done = true;
                                break;
                            case 4:
                                party[2] = PlayerDatabase.NAME[3][0];
                                partyNum[2][0] = PlayerController.players[3].hp;
                                partyNum[2][1] = PlayerController.players[3].maxHp;
                                partyNum[2][2] = PlayerController.players[3].mp;
                                partyNum[2][3] = PlayerController.players[3].maxMp;
                                done = true;
                                break;
                            case 5:
                                party[2] = PlayerDatabase.NAME[4][0];
                                partyNum[2][0] = PlayerController.players[4].hp;
                                partyNum[2][1] = PlayerController.players[4].maxHp;
                                partyNum[2][2] = PlayerController.players[4].mp;
                                partyNum[2][3] = PlayerController.players[4].maxMp;
                                done = true;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Replace with who?");
                    for (int i=0;i<PlayerDatabase.NAME.length;i++) {
                        System.out.println((i+1) + ": " + PlayerDatabase.NAME[i]);
                    }
                    choice2 = input.nextInt();
                    while (!done) {
                        switch (choice2) {
                            case 1:
                                party[3] = PlayerDatabase.NAME[0][2];
                                partyNum[3][0] = PlayerController.players[0].hp;
                                partyNum[3][1] = PlayerController.players[0].maxHp;
                                partyNum[3][2] = PlayerController.players[0].mp;
                                partyNum[3][3] = PlayerController.players[0].maxMp;
                                done = true;
                                break;
                            case 2:
                                party[3] = PlayerDatabase.NAME[1][0];
                                partyNum[3][0] = PlayerController.players[1].hp;
                                partyNum[3][1] = PlayerController.players[1].maxHp;
                                partyNum[3][2] = PlayerController.players[1].mp;
                                partyNum[3][3] = PlayerController.players[1].maxMp;
                                done = true;
                                break;
                            case 3:
                                party[3] = PlayerDatabase.NAME[2][0];
                                partyNum[3][0] = PlayerController.players[2].hp;
                                partyNum[3][1] = PlayerController.players[2].maxHp;
                                partyNum[3][2] = PlayerController.players[2].mp;
                                partyNum[3][3] = PlayerController.players[2].maxMp;
                                done = true;
                                break;
                            case 4:
                                party[3] = PlayerDatabase.NAME[3][0];
                                partyNum[3][0] = PlayerController.players[3].hp;
                                partyNum[3][1] = PlayerController.players[3].maxHp;
                                partyNum[3][2] = PlayerController.players[3].mp;
                                partyNum[3][3] = PlayerController.players[3].maxMp;
                                done = true;
                                break;
                            case 5:
                                party[3] = PlayerDatabase.NAME[4][0];
                                partyNum[3][0] = PlayerController.players[4].hp;
                                partyNum[3][1] = PlayerController.players[4].maxHp;
                                partyNum[3][2] = PlayerController.players[4].mp;
                                partyNum[3][3] = PlayerController.players[4].maxMp;
                                done = true;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                default:
                    continue;
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
