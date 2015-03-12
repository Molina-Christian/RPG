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
            items[i] = new ItemModel(ItemDatabase.NAME[i], ItemDatabase.DESCRIPTION[i], ItemDatabase.TYPE[i], ItemDatabase.EFFECT[i], ItemDatabase.PRICE[i]);
        }
    }
    public void printItems() {
        for (ItemModel item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDesc());
            System.out.println("Type: " + item.getType());
            if (!item.getType().equals("KEY")) {
                System.out.println("Effect: " + item.getEff());
                System.out.println("Price: " + item.getPrice() + "G");
            }
            System.out.println();
        }
    }
}
