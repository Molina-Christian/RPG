/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Models;

/**
 *
 * @author Christian
 */
public class MagicModel {
    public String name;
    public String type;
    public int level;
    public int cost;
    public int power;
    public int accuracy;
    public String element;
    public String target;
    public int price;
    
    public MagicModel(String word, int one, int two, int three, int four, int five, int six, int seven, int eight) {
        this.name = word;
        this.level = two;
        this.cost = three;
        this.power = four;
        this.accuracy = five;
        this.price = eight;
        if (one == 1) {
            this.type = "Black Magic";
        } else if (one == 2) {
            this.type = "White Magic";
        } else if (one == 3) {
            this.type = "Red Magic";
        } else if (one == 4) {
            this.type = "Blue Magic";
        }
        if (six == 1) {
            this.element = "None";
        } else if (six == 2) {
            this.element = "Fire";
        } else if (six == 3) {
            this.element = "Water";
        } else if (six == 4) {
            this.element = "Wind";
        } else if (six == 5) {
            this.element = "Earth";
        } else if (six == 6) {
            this.element = "Status";
        }
        if (seven == 1) {
            this.target = "Self";
        } else if (seven == 2) {
            this.target = "One";
        } else if (seven == 3) {
            this.target = "All";
        }
    }
}
