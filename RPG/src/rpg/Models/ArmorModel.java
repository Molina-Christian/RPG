/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.ArmorDatabase;

/**
 *
 * @author Christian
 */
public class ArmorModel extends DescriptionModel {
    public String TYPE;
    public int DEFENSE;
    public int EVASION;
    public int WEIGHT;
    public int PRICE;
    
    public ArmorModel(String word, String word2, int one, int two, int three, int four, int five) {
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
    public static ArmorModel[] armors = new ArmorModel[ArmorDatabase.NAME.length];
    
    public static void generateArmors() {
        for (int i=0; i<armors.length;i++) {
            armors[i] = new ArmorModel(ArmorDatabase.NAME[i], ArmorDatabase.DESCRIPTION[i], ArmorDatabase.TYPE[i], ArmorDatabase.DEF[i], ArmorDatabase.EVA[i], ArmorDatabase.WGT[i], ArmorDatabase.PRICE[i]);
        }
    }
}
