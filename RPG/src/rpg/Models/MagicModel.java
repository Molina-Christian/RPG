/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.MagicDatabase;

/**
 *
 * @author Christian
 */
public class MagicModel extends DescriptionModel {
    public String TYPE;
    public int LEVEL;
    public int COST;
    public int POWER;
    public int ACCURACY;
    public String ELEMENT;
    public String TARGET;
    public int PRICE;
    
    public MagicModel(String word, String word2, int one, int two, int three, int four, int five, int six, int seven, int eight) {
        super (word, word2);
        this.LEVEL = two;
        this.COST = three;
        this.POWER = four;
        this.ACCURACY = five;
        this.PRICE = eight;
        if (one == 1) {
            this.TYPE = "Black Magic";
        } else if (one == 2) {
            this.TYPE = "White Magic";
        } else if (one == 3) {
            this.TYPE = "Red Magic";
        } else if (one == 4) {
            this.TYPE = "Blue Magic";
        }
        if (six == 1) {
            this.ELEMENT = "None";
        } else if (six == 2) {
            this.ELEMENT = "Fire";
        } else if (six == 3) {
            this.ELEMENT = "Water";
        } else if (six == 4) {
            this.ELEMENT = "Wind";
        } else if (six == 5) {
            this.ELEMENT = "Earth";
        } else if (six == 6) {
            this.ELEMENT = "Status";
        }
        if (seven == 1) {
            this.TARGET = "Self";
        } else if (seven == 2) {
            this.TARGET = "One";
        } else if (seven == 3) {
            this.TARGET = "All";
        }
    }
    
    public String getName() {
        return NAME;
    }
    public String getDesc() {
        return DESCRIPTION;
    }
    public String getType() {
        return TYPE;
    }
    public int getLvl() {
        return LEVEL;
    }
    public int getCost() {
        return COST;
    }
    public int getPwr() {
        return POWER;
    }
    public int getAcc() {
        return ACCURACY;
    }
    public String getElement() {
        return ELEMENT;
    }
    public String getTarget() {
        return TARGET;
    }
    public int getPrice() {
        return PRICE;
    }
    
    //Accessing Database
    public static MagicModel[] magics = new MagicModel[MagicDatabase.NAME.length];
    public static MagicModel[][] inventoryMagic = new MagicModel[4][magics.length];
    
    public static void generateMagic() {
        for (int i=0;i<magics.length;i++) {
            magics[i] = new MagicModel(MagicDatabase.NAME[i], MagicDatabase.DESCRIPTION[i], MagicDatabase.TYPE[i], MagicDatabase.LEVEL[i], MagicDatabase.COST[i], MagicDatabase.PWR[i], MagicDatabase.ACC[i], MagicDatabase.ELEMENT[i], MagicDatabase.TARGET[i], MagicDatabase.PRICE[i]);
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
    
    public static void displayMagic() {
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("**                             MAGIC                                **");
        System.out.println("**********************************************************************");
        System.out.println();
        System.out.println("Black Magic:");
        System.out.println();
        for (MagicModel Magic : inventoryMagic[0]) {
            if (!(Magic == null)) {
                System.out.println(Magic.getName());
            }
        }
        System.out.println();
        System.out.println("White Magic:");
        System.out.println();
        for (MagicModel Magic : inventoryMagic[1]) {
            if (!(Magic == null)) {
                System.out.println(Magic.getName());
            }
        }
        System.out.println();
        System.out.println("Red Magic:");
        System.out.println();
        for (MagicModel Magic : inventoryMagic[2]) {
            if (!(Magic == null)) {
                System.out.println(Magic.getName());
            }
        }
        System.out.println();
        System.out.println("Blue Magic:");
        System.out.println();
        for (MagicModel Magic : inventoryMagic[3]) {
            if (!(Magic == null)) {
                System.out.println(Magic.getName());
            }
        }
    }
}
