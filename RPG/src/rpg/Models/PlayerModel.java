/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import java.util.Random;
import java.util.Scanner;
import rpg.Views.Game;

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
        Game.hero.level++;
        Game.hero.expTo += Game.hero.level * 10;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("**                             LEVEL UP                             **");
        System.out.println("**********************************************************************");
        for (int i=0;i<3;i++) {
            System.out.println();
            System.out.println("Level: " + Game.hero.level);
            System.out.println();
            System.out.println("HP: " + Game.hero.HP + "/" + Game.hero.MAX_HP);
            System.out.println("MP: " + Game.hero.MP + "/" + Game.hero.MAX_MP);
            System.out.println();
            System.out.println("1.\tSTR: " + Game.hero.STR);
            System.out.println("2.\tCON: " + Game.hero.CON);
            System.out.println("3.\tDEX: " + Game.hero.DEX);
            System.out.println("4.\tINT: " + Game.hero.INT);
            System.out.println("5.\tWIS: " + Game.hero.WIS);
            System.out.println("6.\tLUC: " + Game.hero.LUC);
            System.out.println();
            System.out.println("Please select a stat to increase...");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    Game.hero.STR++;
                    break;
                case "2":
                    Game.hero.CON++;
                    break;
                case "3":
                    Game.hero.DEX++;
                    break;
                case "4":
                    Game.hero.INT++;
                    break;
                case "5":
                    Game.hero.WIS++;
                    break;
                case "6":
                    Game.hero.LUC++;
                    break;
                default:
                    System.out.println("Invalid choice. Please make a valid choice.");
                    continue;
            }
            PlayerModel.update();
        }
        if (Game.hero.exp >= Game.hero.expTo) {
            PlayerModel.levelUp();
        }
    }
    private static void update() {
        Game.hero.HP = Game.hero.CON * 10;
        Game.hero.MAX_HP = Game.hero.HP;
        Game.hero.MP = Game.hero.INT * 10;
        Game.hero.MAX_MP = Game.hero.MP;
        
        Game.hero.ATK = (Game.hero.STR * 3) / 2;
        Game.hero.DEF = (Game.hero.CON * 3) / 2;
        Game.hero.M_ATK = (Game.hero.INT * 3) / 2;
        Game.hero.M_DEF = (Game.hero.WIS * 3) / 2;
        Game.hero.SPD = (Game.hero.DEX * 3) / 2;
    }
    
    public String getFirst() {
        return firstName;
    }
    public String getLast() {
        return lastName;
    }
    public String getNick() {
        return nickName;
    }
    public int getLvl() {
        return level;
    }
    public int getEXP() {
        return exp;
    }
    public int getExpTo() {
        return expTo;
    }
    public int getFire() {
        return fire;
    }
    public int getAir() {
        return air;
    }
    public int getEarth() {
        return earth;
    }
    public int getWater() {
        return water;
    }
    
}
