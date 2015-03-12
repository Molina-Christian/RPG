/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Databases.ArmorDatabase;
import rpg.Models.ArmorModel;

/**
 *
 * @author Christian
 */
public class ArmorController {
    //Accessing Database
    public static ArmorModel[] armors = new ArmorModel[ArmorDatabase.NAME.length];
    
    public void generateArmors() {
        for (int i=0; i<armors.length;i++) {
            armors[i] = new ArmorModel(ArmorDatabase.NAME[i], ArmorDatabase.DESCRIPTION[i], ArmorDatabase.TYPE[i], ArmorDatabase.DEF[i], ArmorDatabase.EVA[i], ArmorDatabase.WGT[i], ArmorDatabase.PRICE[i]);
        }
    }
    public void printArmors() {
        for (ArmorModel armor : armors) {
            System.out.println("Name: " + armor.getName());
            System.out.println("Description: " + armor.getDesc());
            System.out.println("Type: " + armor.getType());
            System.out.println("DEF: " + armor.getDef());
            System.out.println("EVA: " + armor.getEva());
            System.out.println("WGT: " + armor.getWgt());
            System.out.println("Price: " + armor.getPrice() + "G");
            System.out.println();
        }
    }
}
