/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Databases.Magics;
import rpg.Models.Magic;

/**
 *
 * @author Christian
 */
public class magic {
    //Accessing Database
    public static Magic[] magics = new Magic[Magics.NAME.length];
    public static Magic[][] inventoryMagic = new Magic[4][magics.length];
    
    public static void generateMagic() {
        for (int i=0;i<magics.length;i++) {
            magics[i] = new Magic(Magics.NAME[i], Magics.DESCRIPTION[i], Magics.TYPE[i], Magics.LEVEL[i], Magics.COST[i], Magics.PWR[i], Magics.ACC[i], Magics.ELEMENT[i], Magics.TARGET[i], Magics.PRICE[i]);
        }
    }
    
    public static void addMagic(int i) {
        switch (magics[i].getType()) {
            case "Black":
                if (inventoryMagic[0][i].equals(magics[i])) {
                    System.out.println("You already have this magic!");
                } else {
                    inventoryMagic[0][i] = magics[i];
                }
                break;
            case "White":
                if (inventoryMagic[0][i].equals(magics[i])) {
                    System.out.println("You already have this magic!");
                } else {
                    inventoryMagic[1][i] = magics[i];
                }
                break;
            case "Red":
                if (inventoryMagic[0][i].equals(magics[i])) {
                    System.out.println("You already have this magic!");
                } else {
                    inventoryMagic[2][i] = magics[i];
                }
                break;
            case "Blue":
                if (inventoryMagic[0][i].equals(magics[i])) {
                    System.out.println("You already have this magic!");
                } else {
                    inventoryMagic[3][i] = magics[i];
                }
                break;
        }
    }
    public static String magicFrame(int what) {
        String display = "";
        switch (what) {
            case 0:
                for (Magic Magic : inventoryMagic[0]) {
                    if (!(Magic == null)) {
                        display += Magic.getName() + "\n";
                    } else {
                        display = "No magic of this type learned!";
                    }
                }
                break;
            case 1:
                for (Magic Magic : inventoryMagic[1]) {
                    if (!(Magic == null)) {
                        display += Magic.getName() + "\n";
                    } else {
                        display = "No magic of this type learned!";
                    }
                }
                break;
            case 2:
                for (Magic Magic : inventoryMagic[2]) {
                    if (!(Magic == null)) {
                        display += Magic.getName() + "\n";
                    } else {
                        display = "No magic of this type learned!";
                    }
                }
                break;
            case 3:
                for (Magic Magic : inventoryMagic[3]) {
                    if (!(Magic == null)) {
                        display += Magic.getName() + "\n";
                    } else {
                        display = "No magic of this type learned!";
                    }
                }
        }
        return display;
    }
}
