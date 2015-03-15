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
    public static InventoryModel[][] inventory = new InventoryModel[4][ItemDatabase.NAME.length+WeaponDatabase.NAME.length+ArmorDatabase.NAME.length+KeyItemDatabase.NAME.length];
    public static void addItem(int CAT, int ID) {
        if (inventory[CAT][ID].amount == 99) {
            System.out.println("You can't hold anymore!");
        } else {
            inventory[CAT][ID].amount++;
        }
    }
    public static void removeItem(int CAT, int ID) {
        if (inventory[CAT][ID].amount == 0) {
            System.out.println("You don't have any!");
        } else {
            inventory[CAT][ID].amount--;
        }
    }
    public static void printInventory() {
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("**                           INVENTORY                              **");
        System.out.println("**********************************************************************");
        System.out.println();
        System.out.println("Items:");
        for (int i=0;i<1;i++) {
            if (inventory[0][i].amount != 0) {
                System.out.println(inventory[0][i].name + " : " + inventory[0][i].amount);
            }
        }
        System.out.println("Weapons:");
        for (int i=0;i<WeaponDatabase.NAME.length;i++) {
            if (inventory[1][i].amount != 0) {
                System.out.println(inventory[1][i].name + " : " + inventory[1][i].amount);
            }
        }
        System.out.println("Armor:");
        for (int i=0;i<ArmorDatabase.NAME.length;i++) {
            if (inventory[2][i].amount != 0) {
                System.out.println(inventory[2][i].name + " : " + inventory[2][i].amount);
            }
        }
        System.out.println("Key Items:");
        for (int i=0;i<KeyItemDatabase.NAME.length;i++) {
            if (inventory[3][i].amount != 0) {
                System.out.println(inventory[3][i].name + " : " + inventory[3][i].amount);
            }
        }
    }
    public void setUpInventory() {
        for (int i=0;i<ItemDatabase.NAME.length;i++) {
            inventory[0][i] = new InventoryModel(ItemDatabase.NAME[i],0);
        }
        for (int i=0;i<WeaponDatabase.NAME.length;i++) {
            inventory[1][i] = new InventoryModel(WeaponDatabase.NAME[i],0);
        }
        for (int i=0;i<ArmorDatabase.NAME.length;i++) {
            inventory[2][i] = new InventoryModel(ArmorDatabase.NAME[i],0);
        }
        for (int i=0;i<KeyItemDatabase.NAME.length;i++) {
            inventory[3][i] = new InventoryModel(KeyItemDatabase.NAME[i],0);
        }
    }
    
    public static String InventoryFrame(int what) {
        String display = "";
        switch (what) {
            case 1:
                for (InventoryModel item : inventory[0]) {
                    if (!(item == null)) {
                        display += item.name + ": " + item.amount + "\n";
                    } else {
                        display = "You have no items of this type!";
                    }
                }
                break;
            case 2:
                for (InventoryModel item : inventory[0]) {
                    if (!(item == null)) {
                        display += item.name + ": " + item.amount + "\n";
                    } else {
                        display = "You have no items of this type!";
                    }
                }
                break;
            case 3:
                for (InventoryModel item : inventory[0]) {
                    if (!(item == null)) {
                        display += item.name + ": " + item.amount + "\n";
                    } else {
                        display = "You have no items of this type!";
                    }
                }
                break;
            case 4:
                for (InventoryModel item : inventory[0]) {
                    if (!(item == null)) {
                        display += item.name + ": " + item.amount + "\n";
                    } else {
                        display = "You have no items of this type!";
                    }
                }
                break;
        }
        return display;
    }
}
