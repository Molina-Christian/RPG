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
            weapons[i] = new WeaponModel(WeaponDatabase.NAME[i], WeaponDatabase.TYPE[i], WeaponDatabase.ATK[i], WeaponDatabase.ACC[i], WeaponDatabase.CRIT[i], WeaponDatabase.PRICE[i]);
        }
    }
    public void printWeapons() {
        for (int i=0; i<weapons.length;i++) {
            System.out.println("Name: " + weapons[i].name);
            System.out.println("Type: " + weapons[i].type);
            System.out.println("ATK: " + weapons[i].attack);
            System.out.println("ACC: " + weapons[i].accuracy);
            System.out.println("CRIT: " + weapons[i].criticalRate);
            System.out.println("Price: " + weapons[i].price + "G");
            System.out.println();
        }
    }
}
