/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Databases.MagicDatabase;
import rpg.Models.MagicModel;

/**
 *
 * @author Christian
 */
public class MagicController {
    //Accessing Database
    public static MagicModel[] magics = new MagicModel[MagicDatabase.NAME.length];
    
    public void generateMagic() {
        for (int i=0;i<magics.length;i++) {
            magics[i] = new MagicModel(MagicDatabase.NAME[i], MagicDatabase.TYPE[i], MagicDatabase.LEVEL[i], MagicDatabase.COST[i], MagicDatabase.PWR[i], MagicDatabase.ACC[i], MagicDatabase.ELEMENT[i], MagicDatabase.TARGET[i], MagicDatabase.PRICE[i]);
        }
    }
    public void printMagic() {
        for (int i=0;i<magics.length;i++) {
            System.out.println("Name: " + magics[i].name);
            System.out.println("Type: " + magics[i].type);
            System.out.println("Level: " + magics[i].level);
            System.out.println("Cost: " + magics[i].cost + "MP");
            System.out.println("PWR: " + magics[i].power);
            System.out.println("ACC: " + magics[i].accuracy);
            System.out.println("Element: " + magics[i].element);
            System.out.println("Target: " + magics[i].target);
            System.out.println("Price: " + magics[i].price + "G");
            System.out.println();
        }
    }
}
