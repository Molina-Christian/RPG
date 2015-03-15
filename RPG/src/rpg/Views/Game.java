/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;

import rpg.Controllers.*;
import rpg.Models.*;

/**
 *
 * @author Christian
 */
public class Game {
    static String intro = "Akasha Trials\ncreated by Christian";
    public static PlayerModel hero;
    
    public static int time = 1;
    public static int day = 1;
    
    public Game() {
        this.setup();
    }
    
    private void setup() {
        // Generating controllers
        InventoryController inventory = new InventoryController();
        
        // Generating Databases
        MobModel.generateMobs();
        BossModel.generateBosses();
        ItemModel.generateItems();
        WeaponModel.generateWeapons();
        ArmorModel.generateArmors();
        MagicModel.generateMagic();
        inventory.setUpInventory();
    }
    private void createHero() {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;
        String word1 = null;
        String word2 = null;
        String word3 = null;
        while (correct != true) {
            System.out.println("Enter a first name: ");
            word1 = input.nextLine();
            word1 = word1.trim();
            System.out.println();
            System.out.println("Enter a last name: ");
            word2 = input.nextLine();
            word2 = word2.trim();
            System.out.println();
            System.out.println("Enter a nickname: ");
            word3 = input.nextLine();
            word3 = word3.trim();
            System.out.println();
            System.out.println(word1 + " " + word2 + ", also known as " + word3 + ". Is this correct? (Y/N)");
            String choice = input.next();
            choice = choice.toUpperCase();
            if (!"Y".equals(choice)) {
                word1 = null;
                word2 = null;
                word3 = null;
                input.nextLine();
            } else {
                correct = true;
            }
        }
        Game.hero = new PlayerModel(word1, word2, word3, 5, 5, 5, 5, 5, 5);
    }
}
