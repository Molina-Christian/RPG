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
    BattleController battleMenu = new BattleController();
    
    public BattleMenuView() {
        
    }
    
    public void getInput() {
        int command = 0;
        Scanner inFile = new Scanner(System.in);
        
        this.display();

        command = inFile.nextInt();

        switch (command) {
            case 1://Attack
                this.battleMenu.playerAttack(1);
                break;
            case 2://Magic
                this.battleMenu.playerSkill(1);
                break;
            case 3://Defend
                this.battleMenu.playerDefend(1);
                break;
            case 4://Run
                this.battleMenu.runAway();
                break;  
            default: 
                System.out.println("You stood around doing nothing...");
                break;
        };
    }
    
    public final void display() {
        System.out.println("*****************************");
        System.out.println("**       PLAYER TURN       **");
        System.out.println("*****************************");
        System.out.println();
        System.out.println("Player:");
        for (int i=0;i<PartyController.party.length;i++) {
            if (PartyController.party[i] != null) {
                System.out.println(PartyController.party[i]);
                System.out.println("HP: " + PartyController.partyNum[i][0] + "/" + PartyController.partyNum[i][1]);
                System.out.println("MP: " + PartyController.partyNum[i][2] + "/" + PartyController.partyNum[i][3]);
                System.out.println();
            }
        }
        System.out.println("Enemy:");
        for (int i=0;i<PartyController.mobs.length;i++) {
            if (PartyController.mobs[i] != null) {
                System.out.println(PartyController.mobs[i]);
                System.out.println("HP: " + PartyController.mobsNum[i][0] + "/" + PartyController.mobsNum[i][1]);
                System.out.println("MP: " + PartyController.mobsNum[i][2] + "/" + PartyController.mobsNum[i][3]);
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
