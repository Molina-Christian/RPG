/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.PlayerModel;
import rpg.Databases.PlayerDatabase;

/**
 *
 * @author Christian
 */
public class PlayerController {
    //Accessing Database
    public static PlayerModel[] players = new PlayerModel[PlayerDatabase.NAME.length + 1];
    
    public void generateParty() {
        for (int i=1; i<players.length;i++) {
            players[i] = new PlayerModel(PlayerDatabase.NAME[i-1][0], PlayerDatabase.NAME[i-1][1], PlayerDatabase.NAME[i-1][2], PlayerDatabase.STR[i-1], PlayerDatabase.CON[i-1], PlayerDatabase.DEX[i-1], PlayerDatabase.INT[i-1], PlayerDatabase.WIS[i-1], PlayerDatabase.LUC[i-1]);
        }
    }
    public void printParty() {
        for (PlayerModel player : players) {
            System.out.println("Name: " + player.firstName + " " + player.lastName + " (" + player.nickName + ")");
            System.out.println("Level: " + player.level);
            System.out.println("Exp: " + player.exp + "/" + player.expTo);
            System.out.println("STR: " + player.str);
            System.out.println("CON: " + player.con);
            System.out.println("DEX: " + player.dex);
            System.out.println("INT: " + player.Int);
            System.out.println("WIS: " + player.wis);
            System.out.println("LUC: " + player.luc);
            System.out.println("ATK: " + player.atk);
            System.out.println("DEF: " + player.def);
            System.out.println("mATK: " + player.mAtk);
            System.out.println("mDEF: " + player.mDef);
            System.out.println("SPD: " + player.spd);
            System.out.println();
        }
    }
}
