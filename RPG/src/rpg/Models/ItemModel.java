/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.ItemDatabase;

/**
 *
 * @author Christian
 */
public class ItemModel extends DescriptionModel {
    public String TYPE;
    public int EFFECT;
    public int PRICE;
    
    public ItemModel(String word, String word2, int one, int two, int three) {
        super (word, word2);
        if (one == 1) {
            this.TYPE = "Healing";
            this.EFFECT = two;
            this.PRICE = three;
        } else if (one == 2) {
            this.TYPE = "Booster";
            this.EFFECT = two;
            this.PRICE = three;
        } else if (one == 3) {
            this.TYPE = "Attack";
            this.EFFECT = two;
            this.PRICE = three;
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
    public int getEff() {
        return EFFECT;
    }
    public int getPrice() {
        return PRICE;
    }
    
    //Accessing Database
    public static ItemModel[] items = new ItemModel[ItemDatabase.NAME.length];
    
    public static void generateItems() {
        for (int i=0; i<items.length;i++) {
            items[i] = new ItemModel(ItemDatabase.NAME[i], ItemDatabase.DESCRIPTION[i], ItemDatabase.TYPE[i], ItemDatabase.EFFECT[i], ItemDatabase.PRICE[i]);
        }
    }
}
