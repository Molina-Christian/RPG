/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.ItemModel;
import rpg.Databases.ItemDatabase;

/**
 *
 * @author Christian
 */
public class ItemController {
    //Accessing Database
    public static ItemModel[] items = new ItemModel[ItemDatabase.NAME.length];
    
    public void generateItems() {
        for (int i=0; i<items.length;i++) {
            items[i] = new ItemModel(ItemDatabase.NAME[i], ItemDatabase.TYPE[i], ItemDatabase.EFFECT[i], ItemDatabase.PRICE[i]);
        }
    }
    public void printItems() {
        for (int i = 0; i<items.length; i++) {
            System.out.println("Name: " + items[i].name);
            System.out.println("Type: " + items[i].type);
            if (items[i].type != "KEY") {
                System.out.println("Effect: " + items[i].effect);
                System.out.println("Price: " + items[i].price + "G");
            }
            System.out.println();
        }
    }
}
