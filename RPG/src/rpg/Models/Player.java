/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import java.util.Random;
import java.util.Scanner;
import rpg.Controllers.Game;
import rpg.Frames.AkashicTrials;

/**
 *
 * @author Christian
 */
public class Player extends Battler {
    public String firstName;
    public String lastName;
    public String nickName;
    
    public int level = 1;
    public int exp = 0;
    public int expTo = this.level * 10;
    public int gold;
    
    public int fire = 1;
    public int water = 1;
    public int earth = 1;
    public int air = 1;
    public int fireEXP = 0;
    public int waterEXP = 0;
    public int earthEXP = 0;
    public int airEXP = 0;
    
    Random roll = new Random();
    
    public Player(String name1, String name2, String name3, int one, int two, int three, int four, int five, int six) {
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
        Player.update();
        if (AkashicTrials.hero.exp >= AkashicTrials.hero.expTo) {
            Player.levelUp();
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
    public int getGold() {
        return gold;
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
