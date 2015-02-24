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
public class WeaponModel {
    public String name;
    public String type;
    public int attack;
    public int accuracy;
    public int criticalRate;
    public int price;
    
    public WeaponModel(String word, int one, int two, int three, int four, int five) {
        this.name = word;
        this.attack = two;
        this.accuracy = three;
        this.criticalRate = four;
        this.price = five;
        if (one == 1) {
            this.type = "Sword";
        } else if (one == 2) {
            this.type = "Axe";
        } else if (one == 3) {
            this.type = "Hammer";
        } else if (one == 4) {
            this.type = "Stave";
        } else if (one == 5) {
            this.type = "Lance";
        } else if (one == 6) {
            this.type = "Fist";
        } else if (one == 7) {
            this.type = "Special";
        }
    }
}
