/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Databases.TownDatabase;
import rpg.Models.TownModel;

/**
 *
 * @author Christian
 */
public class TownController {
    //Accessing Database
    public static TownModel[] towns = new TownModel[TownDatabase.NAME.length];
    
    public void generateTowns() {
        for (int i=0;i<TownDatabase.NAME.length;i++) {
            towns[i] = new TownModel(TownDatabase.NAME[i], TownDatabase.DESCRIPTION[i], TownDatabase.WEAPON[i], TownDatabase.ARMOR[i], TownDatabase.ITEM[i], TownDatabase.EVENT[i]);
        }
    }
    
    public void printTowns() {
        for (int i=0;i<towns.length;i++) {
            System.out.println("Name: " + towns[i].name);
            System.out.println(towns[i].desc);
            System.out.println("Weapon Shop: " + towns[i].weaponShop);
            System.out.println("Armor Shop: " + towns[i].armorShop);
            System.out.println("Item Shop: " + towns[i].itemShop);
            System.out.println("Events: " + towns[i].events);
            System.out.println();
        }
    }
}
