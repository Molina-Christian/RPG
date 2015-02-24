/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

/**
 *
 * @author Christian
 */
public class PlayerModel {
    public String firstName;
    public String lastName;
    public String nickName;
    public int str;
    public int con;
    public int dex;
    public int Int;
    public int wis;
    public int luc;
    
    public int level = 1;
    public int exp = 0;
    public int expTo;
    
    public int hp;
    public int maxHp;
    public int mp;
    public int maxMp;
    
    public int atk;
    public int def;
    public int mAtk;
    public int mDef;
    public int spd;
    
    public int fire = 1;
    public int water = 1;
    public int earth = 1;
    public int air = 1;
    public int fireEXP = 0;
    public int waterEXP = 0;
    public int earthEXP = 0;
    public int airEXP = 0;
    
    public int affection = 0;
    
    public PlayerModel(String name1, String name2, String name3, int one, int two, int three, int four, int five, int six) {
        this.firstName = name1;
        if (name2 != null) {
            this.lastName = name2;
        }
        if (name3 != null) {
            this.nickName = name3;
        }
        this.str = one;
        this.con = two;
        this.dex = three;
        this.Int = four;
        this.wis = five;
        this.luc = six;
        this.expTo = this.level * 100;
        this.maxHp = this.con * 10;
        this.maxMp = this.Int * 10;
        this.hp = this.maxHp;
        this.mp = this.maxMp;
        this.atk = (this.str * 5) / 2;
        this.def = (this.con * 5) / 2;
        this.mAtk = (this.Int * 5) / 2;
        this.mDef = (this.wis * 5) / 2;
        this.spd = (this.dex * 5) / 2;
    }
}
