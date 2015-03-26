/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import rpg.Models.*;

/**
 *
 * @author Christian
 */
public class Game {
    public static int time = 1;
    public static int day = 1;
    
    public Game() {
        this.setup();
    }
    
    private void setup() {
        // Generating Databases
        Mob.generateMobs();
        Boss.generateBosses();
        Item.generateItems();
        Weapon.generateWeapons();
        Armor.generateArmors();
        magic.generateMagic();
        Inventory.setUpInventory();
    }
}
