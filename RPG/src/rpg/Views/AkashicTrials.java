/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Views;

import java.util.Scanner;

import rpg.Controllers.*;
import rpg.Models.*;
import rpg.Views.*;
import rpg.Databases.*;

/**
 *
 * @author Fred and Karen Call
 */
public class AkashicTrials {
    static Scanner input = new Scanner(System.in);
    
    static String intro = "Akasha Trials\ncreated by Christian";
    
    public static int time = 1;
    public static int day = 1;
    
    public AkashicTrials() {
        // Introduction
        this.setup();
        System.out.println(intro);
        System.out.println();
        // Party generation must be after players are generated
        PartyController party = new PartyController(this.createHero());
        ThaoView.getInput(0);
    }
    
    private void setup() {
        // Generating controllers
        MobController mob = new MobController();
        PlayerController player =  new PlayerController();
        ItemController item = new ItemController();
        BossController boss = new BossController();
        WeaponController weapon = new WeaponController();
        ArmorController armor = new ArmorController();
        MagicController magic = new MagicController();
        TownController town = new TownController();
        InventoryController inventory = new InventoryController();
        EventController event = new EventController();
        
        // Generating Databases
        mob.generateMobs();
        boss.generateBosses();
        player.generateParty();
        item.generateItems();
        weapon.generateWeapons();
        armor.generateArmors();
        magic.generateMagic();
        town.generateTowns();
        inventory.setUpInventory();
    }
    private PlayerModel createHero() {
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
        PlayerModel hero = new PlayerModel(word1, word2, word3, 5, 5, 5, 5, 5, 5);
        return hero;
    }
}
