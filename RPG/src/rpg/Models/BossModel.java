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
public class BossModel {
    public String name;
    public int strength;
    public int constitution;
    public int dexterity;
    public int intelligence;
    public int wisdom;
    public int luck;
    
    public BossModel(String name, int str, int con, int dex, int Int, int wis, int luc) {
        this.name = name;
        this.strength = str;
        this.constitution = con;
        this.dexterity = dex;
        this.intelligence = Int;
        this.wisdom = wis;
        this.luck = luc;
    }
}