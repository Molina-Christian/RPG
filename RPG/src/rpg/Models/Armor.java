/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.Armors;

/**
 *
 * @author Christian
 */
public class Armor extends Description {
    public String TYPE;
    public int DEFENSE;
    public int EVASION;
    public int WEIGHT;
    public int PRICE;
    
    public Armor(String word, String word2, int one, int two, int three, int four, int five) {
        super (word, word2);
        this.DEFENSE = two;
        this.EVASION = three;
        this.WEIGHT = four;
        this.PRICE = five;
        if (one == 1) {
            this.TYPE = "Shield";
        } else if (one == 2) {
            this.TYPE = "Helmet";
        } else if (one == 3) {
            this.TYPE = "Body Armor";
        } else if (one == 4) {
            this.TYPE = "Gloves";
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
    public int getDef() {
        return DEFENSE;
    }
    public int getEva() {
        return EVASION;
    }
    public int getWgt() {
        return WEIGHT;
    }
    public int getPrice() {
        return PRICE;
    }
    
    //Accessing Database
    public static Armor[] armors = new Armor[Armors.NAME.length];
    
    public static void generateArmors() {
        for (int i=0; i<armors.length;i++) {
            armors[i] = new Armor(Armors.NAME[i], Armors.DESCRIPTION[i], Armors.TYPE[i], Armors.DEF[i], Armors.EVA[i], Armors.WGT[i], Armors.PRICE[i]);
        }
    }
}
