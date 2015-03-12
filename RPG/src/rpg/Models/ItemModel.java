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
}
