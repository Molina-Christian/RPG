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
            armors[i] = new ArmorModel(ArmorDatabase.NAME[i], ArmorDatabase.TYPE[i], ArmorDatabase.DEF[i], ArmorDatabase.EVA[i], ArmorDatabase.WGT[i], ArmorDatabase.PRICE[i]);
        }
    }
    public void printArmors() {
        for (int i=0; i<armors.length;i++) {
            System.out.println("Name: " + armors[i].name);
            System.out.println("Type: " + armors[i].type);
            System.out.println("DEF: " + armors[i].defense);
            System.out.println("EVA: " + armors[i].evasion);
            System.out.println("WGT: " + armors[i].weight);
            System.out.println("Price: " + armors[i].price + "G");
            System.out.println();
        }
    }
}
