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
public class WeaponModel extends DescriptionModel {
    public String TYPE;
    public int ATTACK;
    public int ACCURACY;
    public int CRITICAL;
    public int PRICE;
    
    public WeaponModel(String word, String word2, int one, int two, int three, int four, int five) {
        super (word, word2);
        this.ATTACK = two;
        this.ACCURACY = three;
        this.CRITICAL = four;
        this.PRICE = five;
        if (one == 1) {
            this.TYPE = "Sword";
        } else if (one == 2) {
            this.TYPE = "Axe";
        } else if (one == 3) {
            this.TYPE = "Hammer";
        } else if (one == 4) {
            this.TYPE = "Stave";
        } else if (one == 5) {
            this.TYPE = "Lance";
        } else if (one == 6) {
            this.TYPE = "Fist";
        } else if (one == 7) {
            this.TYPE = "Special";
        }
    }
    
    public String getName() {
        return NAME;
    }
    public String getDesc() {
        return DESCRIPTION;
    }
    public String getType() {
        return TYPE;
    }
    public int getAtk() {
        return ATTACK;
    }
    public int getAcc() {
        return ACCURACY;
    }
    public int getCrit() {
        return CRITICAL;
    }
    public int getPrice() {
        return PRICE;
    }
}
