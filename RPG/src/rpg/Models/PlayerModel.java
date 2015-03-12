/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import java.util.Random;
import java.util.Scanner;
import rpg.Views.AkashicTrials;

/**
 *
 * @author Christian
 */
public class PlayerModel extends Battler {
    public String firstName;
    public String lastName;
    public String nickName;
    
    public int level = 1;
    public int exp = 0;
    public int expTo = this.level * 10;
    
    public int fire = 1;
    public int water = 1;
    public int earth = 1;
    public int air = 1;
    public int fireEXP = 0;
    public int waterEXP = 0;
    public int earthEXP = 0;
    public int airEXP = 0;
    
    public int affection = 0;
    
    Random roll = new Random();
    
    public PlayerModel(String name1, String name2, String name3, int one, int two, int three, int four, int five, int six) {
        super (one, two, three, four, five, six);
        this.firstName = name1;
        if (name2 != null) {
            this.lastName = name2;
        }
        if (name3 != null) {
            this.nickName = name3;
        }
    }

    public static void levelUp() {
        AkashicTrials.hero.level++;
        AkashicTrials.hero.expTo += AkashicTrials.hero.level * 10;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("**                             LEVEL UP                             **");
        System.out.println("**********************************************************************");
        for (int i=0;i<3;i++) {
            System.out.println();
            System.out.println("Level: " + AkashicTrials.hero.level);
            System.out.println();
            System.out.println("HP: " + AkashicTrials.hero.HP + "/" + AkashicTrials.hero.MAX_HP);
            System.out.println("MP: " + AkashicTrials.hero.MP + "/" + AkashicTrials.hero.MAX_MP);
            System.out.println();
            System.out.println("1.\tSTR: " + AkashicTrials.hero.STR);
            System.out.println("2.\tCON: " + AkashicTrials.hero.CON);
            System.out.println("3.\tDEX: " + AkashicTrials.hero.DEX);
            System.out.println("4.\tINT: " + AkashicTrials.hero.INT);
            System.out.println("5.\tWIS: " + AkashicTrials.hero.WIS);
            System.out.println("6.\tLUC: " + AkashicTrials.hero.LUC);
            System.out.println();
            System.out.println("Please select a stat to increase...");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    AkashicTrials.hero.STR++;
                    break;
                case "2":
                    AkashicTrials.hero.CON++;
                    break;
                case "3":
                    AkashicTrials.hero.DEX++;
                    break;
                case "4":
                    AkashicTrials.hero.INT++;
                    break;
                case "5":
                    AkashicTrials.hero.WIS++;
                    break;
                case "6":
                    AkashicTrials.hero.LUC++;
                    break;
                default:
                    System.out.println("Invalid choice. Please make a valid choice.");
                    continue;
            }
            PlayerModel.update();
        }
        if (AkashicTrials.hero.exp >= AkashicTrials.hero.expTo) {
            PlayerModel.levelUp();
        }
    }

    private static void update() {
        AkashicTrials.hero.HP = AkashicTrials.hero.CON * 10;
        AkashicTrials.hero.MAX_HP = AkashicTrials.hero.HP;
        AkashicTrials.hero.MP = AkashicTrials.hero.INT * 10;
        AkashicTrials.hero.MAX_MP = AkashicTrials.hero.MP;
        
        AkashicTrials.hero.ATK = (AkashicTrials.hero.STR * 3) / 2;
        AkashicTrials.hero.DEF = (AkashicTrials.hero.CON * 3) / 2;
        AkashicTrials.hero.M_ATK = (AkashicTrials.hero.INT * 3) / 2;
        AkashicTrials.hero.M_DEF = (AkashicTrials.hero.WIS * 3) / 2;
        AkashicTrials.hero.SPD = (AkashicTrials.hero.DEX * 3) / 2;
    }
}
