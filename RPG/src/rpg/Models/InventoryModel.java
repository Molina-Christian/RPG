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
public class InventoryModel {
    public String name;
    public int amount;
    
    public InventoryModel(String word, int number) {
        this.name = word;
        this.amount = number;
    }
}
