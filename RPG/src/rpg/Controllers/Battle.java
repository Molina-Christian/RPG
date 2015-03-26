/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import java.util.Scanner;
import java.util.Random;
import rpg.Frames.Battles;

/**
 *
 * @author Christian
 */
public class Battle {
    static Scanner input = new Scanner(System.in);
    static Random roll = new Random();
    private static int damage;
    public static Boolean playerDefend;
    public static Boolean mobDefend;
    private static Battles view;
    
    public Battle(Battles what) {
        this.view = what;
    }
    
    public void playerAttack() {
        if (view.fighter.getSPD() > view.foe.getSPD()) {
            damage = view.fighter.getATK() - view.foe.getDEF();
            if (damage <= 0) {
                view.display.setText("You did no damage to " + view.foe.getName() + "!");
            } else {
                view.foe.HP -= damage;
                view.display.setText("You did " + damage + " damage to " + view.foe.getName() + "!");
            }
        }
    }
    public void playerSkill() {
        
    }
    public void playerDefend() {
        Battle.playerDefend = true;
        view.fighter.DEF *= 2;
    }
    
    public void mobAttack() {
        if (view.foe.getSPD() > view.fighter.getSPD()) {
            damage = view.foe.getATK() - view.fighter.getDEF();
            if (damage <= 0) {
            } else {
                view.fighter.HP -= damage;
            }
        }
    }
    public void mobSkill() {
        
    }
    public void mobDefend() {
        Battle.mobDefend = true;
        view.foe.DEF *= 2;
    }

    public void enemyTurn() {
        int what = roll.nextInt(10);
        switch (what) {
            case 0-6:
                this.mobAttack();
                break;
            case 7-9:
                this.mobDefend();
                break;
        }
        if (Battle.playerDefend.equals(true)) {
            Battle.playerDefend = false;
            view.fighter.DEF = view.fighter.getDEF() / 2;
        }
    }
}
