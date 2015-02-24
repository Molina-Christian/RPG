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
public class ArmorModel {
    public String name;
    public String type;
    public int defense;
    public int evasion;
    public int weight;
    public int price;
    
    public ArmorModel(String word, int one, int two, int three, int four, int five) {
        this.name = word;
        this.defense = two;
        this.evasion = three;
        this.weight = four;
        this.price = five;
        if (one == 1) {
            this.type = "Shield";
        } else if (one == 2) {
            this.type = "Helmet";
        } else if (one == 3) {
            this.type = "Body Armor";
        } else if (one == 4) {
            this.type = "Gloves";
        }
    }
}
