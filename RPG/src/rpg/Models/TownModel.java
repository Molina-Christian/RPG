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
public class TownModel {
    public String name;
    public String desc;
    public String weaponShop;
    public String armorShop;
    public String itemShop;
    public int events;
    
    public TownModel(String word, String word2, Boolean one, Boolean two, Boolean three, int number) {
        this.name = word;
        this.desc = word2;
        if (one != false) {
            this.weaponShop = "Yes";
        } else {
            this.weaponShop = "No";
        }
        if (two != false) {
            this.armorShop = "Yes";
        } else {
            this.armorShop = "No";
        }
        if (three != false) {
            this.itemShop = "Yes";
        } else {
            this.itemShop = "No";
        }
        this.events = number;
    }
}
