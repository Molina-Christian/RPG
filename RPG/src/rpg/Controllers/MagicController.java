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
            magics[i] = new MagicModel(MagicDatabase.NAME[i], MagicDatabase.DESCRIPTION[i], MagicDatabase.TYPE[i], MagicDatabase.LEVEL[i], MagicDatabase.COST[i], MagicDatabase.PWR[i], MagicDatabase.ACC[i], MagicDatabase.ELEMENT[i], MagicDatabase.TARGET[i], MagicDatabase.PRICE[i]);
        }
    }
    public static void printMagic() {
        System.out.println();
        for (MagicModel magic : magics) {
            System.out.println("Name: " + magic.getName());
            System.out.println("Description: " + magic.getDesc());
            System.out.println("Type: " + magic.getType());
            System.out.println("Level: " + magic.getLvl());
            System.out.println("Cost: " + magic.getCost() + "MP");
            System.out.println("PWR: " + magic.getPwr());
            System.out.println("ACC: " + magic.getAcc());
            System.out.println("Element: " + magic.getElement());
            System.out.println("Target: " + magic.getTarget());
            System.out.println("Price: " + magic.getPrice() + "G");
            System.out.println();
        }
    }
}
