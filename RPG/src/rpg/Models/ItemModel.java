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
public class ItemModel {
    public String name;
    public String type;
    public int effect;
    public int price;
    
    public ItemModel(String word, int one, int two, int three) {
        this.name = word;
        if (one == 1) {
            this.type = "Healing";
            this.effect = two;
            this.price = three;
        } else if (one == 2) {
            this.type = "Booster";
            this.effect = two;
            this.price = three;
        } else if (one == 3) {
            this.type = "Attack";
            this.effect = two;
            this.price = three;
        }
    }
}
