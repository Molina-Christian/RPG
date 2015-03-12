/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;
import rpg.Controllers.PartyController;
import rpg.Controllers.BattleController;

/**
 *
 * @author Christian
 */
public class BattleMenuView {
    private final static String[][] battleMenuItems = {
        {"1.", "Attack"},
        {"2.", "Magic (Not Implemented)"},
        {"3.", "Defend"},
        {"4.", "Run"}
    };
    public static int enemyCounter;
    public static Boolean run = false;

    public static void initiate() {
        PartyController.buildEncounter();
        BattleController.playerDefend = false;
        BattleController.mobDefend = false;
        
        run = false;
        for (;;) {
            BattleMenuView.getInput();
            if (!BattleController.mobDefend.equals(true)) {
            } else {
                BattleController.mobDefend = false;
                PartyController.party[0].DEF = PartyController.party[0].DEF / 2;
            }
            if (run.equals(true)) {
                break;
            } else if (PartyController.party[0].HP <= 0) {
                break;
            }
            BattleController.enemyTurn();
            if (!BattleController.playerDefend.equals(true)) {
            } else {
                BattleController.playerDefend = false;
                AkashicTrials.hero.DEF = AkashicTrials.hero.DEF / 2;
            }
            if (AkashicTrials.hero.HP <= 0) {
                break;
            }
        }
        PartyController.refresh();
    }
    BattleController battleMenu = new BattleController();
    
    public BattleMenuView() {
        
    }
    
    public static void getInput() {
        String command;
        Scanner inFile = new Scanner(System.in);
        
        BattleMenuView.display();

        command = inFile.nextLine();

        switch (command) {
            case "1"://Attack
                BattleController.playerAttack();
                break;
            case "2"://Magic
                BattleController.playerSkill();
                break;
            case "3"://Defend
                BattleController.playerDefend();
                break;
            case "4"://Run
                BattleController.runAway();
                break;  
            default: 
                System.out.println("You stood around doing nothing...");
                break;
        };
    }
    
    private static void display() {
        System.out.println("*****************************");
        System.out.println("**       PLAYER TURN       **");
        System.out.println("*****************************");
        System.out.println();
        System.out.println("Player:");
        System.out.println(AkashicTrials.hero.nickName);
        System.out.println("HP: " + AkashicTrials.hero.HP + "/" + AkashicTrials.hero.MAX_HP);
        System.out.println("MP: " + AkashicTrials.hero.MP + "/" + AkashicTrials.hero.MAX_MP);
        System.out.println();
        System.out.println("Enemy:");
        for (int i=0;i<PartyController.party.length;i++) {
            if (PartyController.party[i] != null) {
                System.out.println(PartyController.party[i].NAME);
                System.out.println("HP: " + PartyController.party[i].HP + "/" + PartyController.party[i].MAX_HP);
                System.out.println("MP: " + PartyController.party[i].MP + "/" + PartyController.party[i].MAX_MP);
                System.out.println();
            }
        }
        for (int i=0; i<BattleMenuView.battleMenuItems.length;i++) {
            System.out.println("\t" + battleMenuItems[i][0] + " " + battleMenuItems[i][1] + "\n");
        }
        System.out.println();
        System.out.println("Please select an option: ");
    }
}
