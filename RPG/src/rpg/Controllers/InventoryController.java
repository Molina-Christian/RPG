/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.InventoryModel;
import rpg.Databases.ItemDatabase;
import rpg.Databases.ArmorDatabase;
import rpg.Databases.KeyItemDatabase;
import rpg.Databases.WeaponDatabase;

/**
 *
 * @author Christian
 */
public class InventoryController {
    public static InventoryModel[] inventory = new InventoryModel[4];
    public static void addItem(int CAT) {
        if (inventory[CAT].amount == 99) {
            System.out.println("You can't hold anymore!");
        } else {
            inventory[CAT].amount++;
        }
    }
    public static void removeItem(int CAT) {
        if (inventory[CAT].amount == 0) {
            System.out.println("You don't have any!");
        } else {
            inventory[CAT].amount--;
        }
    }
    public void printInventory() {
        for (int i=0;i<1;i++) {
            if (inventory[i].name != null) {
                System.out.println(inventory[0].name + " : " + inventory[0].amount);
            }
        }
        for (int i=0;i<WeaponDatabase.NAME.length;i++) {
            if (inventory[i].name != null) {
                System.out.println(inventory[1].name + " : " + inventory[1].amount);
            }
        }
        for (int i=0;i<ArmorDatabase.NAME.length;i++) {
            if (inventory[2].name != null) {
                System.out.println(inventory[2].name + " : " + inventory[2].amount);
            }
        }
        for (int i=0;i<KeyItemDatabase.NAME.length;i++) {
            if (inventory[3].name != null) {
                System.out.println(inventory[3].name + " : " + inventory[3].amount);
            }
        }
    }
    public void setUpInventory() {
        for (int i=0;i<ItemDatabase.NAME.length;i++) {
            inventory[0] = new InventoryModel(ItemDatabase.NAME[i],0);
        }
        for (int i=0;i<WeaponDatabase.NAME.length;i++) {
            inventory[1] = new InventoryModel(WeaponDatabase.NAME[i],0);
        }
        for (int i=0;i<ArmorDatabase.NAME.length;i++) {
            inventory[2] = new InventoryModel(ArmorDatabase.NAME[i],0);
        }
        for (int i=0;i<KeyItemDatabase.NAME.length;i++) {
            inventory[3] = new InventoryModel(KeyItemDatabase.NAME[i],0);
        }
    }
}
