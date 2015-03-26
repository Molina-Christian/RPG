/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

import rpg.Databases.Magics;

/**
 *
 * @author Christian
 */
public class Magic extends Description {
    public String TYPE;
    public int LEVEL;
    public int COST;
    public int POWER;
    public int ACCURACY;
    public String ELEMENT;
    public String TARGET;
    public int PRICE;
    
    public Magic(String word, String word2, int one, int two, int three, int four, int five, int six, int seven, int eight) {
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
}
