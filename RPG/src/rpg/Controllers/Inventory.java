/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.Inventories;
import rpg.Databases.*;

/**
 *
 * @author Christian
 */
public class Inventory {
    public static Inventories[][] inventory = new Inventories[4][Items.NAME.length+Weapons.NAME.length+Armors.NAME.length+KeyItems.NAME.length];
    public static String message;
    
    public static void addItem(int CAT, int ID) {
        if (inventory[CAT][ID].amount == 99) {
            message = "You can't hold anymore!";
        } else {
            inventory[CAT][ID].amount++;
        }
    }
    public static void removeItem(int CAT, int ID) {
        if (inventory[CAT][ID].amount == 0) {
            message = "You don't have any!";
        } else {
            inventory[CAT][ID].amount--;
        }
    }
    public static void setUpInventory() {
        for (int i=0;i<Items.NAME.length;i++) {
            inventory[0][i] = new Inventories(Items.NAME[i],0);
        }
        for (int i=0;i<Weapons.NAME.length;i++) {
            inventory[1][i] = new Inventories(Weapons.NAME[i],0);
        }
        for (int i=0;i<Armors.NAME.length;i++) {
            inventory[2][i] = new Inventories(Armors.NAME[i],0);
        }
        for (int i=0;i<KeyItems.NAME.length;i++) {
            inventory[3][i] = new Inventories(KeyItems.NAME[i],0);
        }
    }
    public static String InventoryFrame(int what) {
        String display = "";
        switch (what) {
            case 1:
                for (Inventories item : inventory[0]) {
                    if (!(item == null)) {
                        display += item.name + ": " + item.amount + "\n";
                    } else {
                        display = "You have no items of this type!";
                    }
                }
                break;
            case 2:
                for (Inventories item : inventory[0]) {
                    if (!(item == null)) {
                        display += item.name + ": " + item.amount + "\n";
                    } else {
                        display = "You have no items of this type!";
                    }
                }
                break;
            case 3:
                for (Inventories item : inventory[0]) {
                    if (!(item == null)) {
                        display += item.name + ": " + item.amount + "\n";
                    } else {
                        display = "You have no items of this type!";
                    }
                }
                break;
            case 4:
                for (Inventories item : inventory[0]) {
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
