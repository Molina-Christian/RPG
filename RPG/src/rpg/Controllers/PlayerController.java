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
        for (int i = 0; i<players.length; i++) {
            System.out.println("Name: " + players[i].firstName + " " + players[i].lastName);
            System.out.println("Nickname: " + players[i].nickName);
            System.out.println("Level: " + players[i].level);
            System.out.println("Exp: " + players[i].exp + "/" + players[i].expTo);
            System.out.println("STR: " + players[i].str);
            System.out.println("CON: " + players[i].con);
            System.out.println("DEX: " + players[i].dex);
            System.out.println("INT: " + players[i].Int);
            System.out.println("WIS: " + players[i].wis);
            System.out.println("LUC: " + players[i].luc);
            System.out.println();
        }
    }
}
