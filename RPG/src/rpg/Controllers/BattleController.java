/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import java.util.Scanner;
import java.util.Random;
import rpg.Models.MobModel;
import rpg.Models.PlayerModel;
import rpg.Views.Game;
import rpg.Views.BattleMenuView;

/**
 *
 * @author Christian
 */
public class BattleController {
    static Scanner input = new Scanner(System.in);
    static Random roll = new Random();
    private static int choice;
    private static int damage;
    public static Boolean playerDefend;
    public static Boolean mobDefend;
    
    public static void playerAttack() {
        System.out.println("Select a target...");
        for (int i=0;i<PartyController.party.length;i++) {
            if (PartyController.party[i] != null) {
                System.out.println((i+1) + ". " + PartyController.party[i].NAME);
            }
        }
        choice = input.nextInt();
        for (;;) {
            if (choice <= PartyController.party.length) {
                if (Game.hero.SPD >= PartyController.party[choice-1].SPD) {
                    damage = Game.hero.ATK - PartyController.party[choice-1].DEF;
                    if (damage < 0) {
                        System.out.println(Game.hero.nickName + " did no damage!");
                    } else {
                        PartyController.party[choice-1].HP -= damage;
                        System.out.println(Game.hero.nickName + " did " + damage + " damage to " + PartyController.party[choice-1].NAME + "!");
                    }
                    if (PartyController.party[choice-1].HP <= 0) {
                        BattleMenuView.enemyCounter--;
                        Game.hero.exp += PartyController.party[choice-1].MAX_HP;
                        if (Game.hero.exp >= Game.hero.expTo) {
                            PlayerModel.levelUp();
                        }
                    } 
                } else {
                    System.out.println(Game.hero.nickName + " missed...");
                }
                break;
            } else {
                System.out.println("That is not a choice...");
            }
        }
    }
    public static void playerSkill() {
        
    }
    public static void playerDefend() {
        Game.hero.DEF *= 2;
        playerDefend = true;
            
    }
    public static void runAway() {
        int average1 = Game.hero.SPD;
        int average2 = 0;
        //for (MobModel party : PartyController.party) {
        //    average2 += party.SPD;
        //}
        //average2 = average2 / PartyController.party.length;
        if (average1 >= average2) {
            BattleMenuView.run = true;
        } else {
            System.out.println("The enemy stopped you from escaping!");
        }
         
    }
    
    public static void mobAttack() {
        if (PartyController.party[0].SPD >= Game.hero.SPD) {
            damage = PartyController.party[0].ATK - Game.hero.DEF;
            if (damage < 0) {
                System.out.println(PartyController.party[0].NAME + " did no damage...");
            } else {
                Game.hero.HP -= damage;
                System.out.println(Game.hero.nickName + " took " + damage + " damage!");
            }
        } else {
            System.out.println(PartyController.party[0].NAME + " missed...");
        }
    }
    public static void mobSkill() {
        
    }
    public static void mobDefend() {
        PartyController.party[0].DEF *= 2;
        mobDefend = true;
    }

    public static void enemyTurn() {
        int what = roll.nextInt(10);
        switch (what) {
            case 0-6:
                BattleController.mobAttack();
                break;
            case 7-9:
                BattleController.mobDefend();
                break;
        }
    }
}
