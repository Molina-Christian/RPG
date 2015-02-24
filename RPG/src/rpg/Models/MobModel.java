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
public class MobModel {
    public String name;
    public int strength;
    public int constitution;
    public int dexterity;
    public int intelligence;
    public int wisdom;
    public int luck;
    public int hp;
    public int maxHp;
    public int mp;
    public int maxMp;
    public int atk;
    public int def;
    public int mAtk;
    public int mDef;
    public int spd;
    
    public MobModel(String name, int str, int con, int dex, int Int, int wis, int luc) {
        this.name = name;
        this.strength = str;
        this.constitution = con;
        this.dexterity = dex;
        this.intelligence = Int;
        this.wisdom = wis;
        this.luck = luc;
        this.maxHp = this.constitution * 10;
        this.maxMp = this.intelligence * 10;
        this.hp = this.maxHp;
        this.mp = this.maxMp;
        this.atk = (this.strength * 5) / 2;
        this.def = (this.constitution * 5) / 2;
        this.mAtk = (this.intelligence * 5) / 2;
        this.mDef = (this.wisdom * 5) / 2;
        this.spd = (this.dexterity * 5) / 2;
    }
}
