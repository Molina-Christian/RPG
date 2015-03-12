/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.WeaponModel;
import rpg.Databases.WeaponDatabase;

/**
 *
 * @author Christian
 */
public class WeaponController {
    //Accessing Database
    public static WeaponModel[] weapons = new WeaponModel[WeaponDatabase.NAME.length];
    
    public void WeaponController() {
        
    }
    
    public void generateWeapons() {
        for (int i=0; i<weapons.length;i++) {
            weapons[i] = new WeaponModel(WeaponDatabase.NAME[i], WeaponDatabase.DESCRIPTION[i], WeaponDatabase.TYPE[i], WeaponDatabase.ATK[i], WeaponDatabase.ACC[i], WeaponDatabase.CRIT[i], WeaponDatabase.PRICE[i]);
        }
    }
    public void printWeapons() {
        for (WeaponModel weapon : weapons) {
            System.out.println("Name: " + weapon.getName());
            System.out.println("Description: " + weapon.getDesc());
            System.out.println("Type: " + weapon.getType());
            System.out.println("ATK: " + weapon.getAtk());
            System.out.println("ACC: " + weapon.getAcc());
            System.out.println("CRIT: " + weapon.getCrit());
            System.out.println("Price: " + weapon.getPrice() + "G");
            System.out.println();
        }
    }
}
