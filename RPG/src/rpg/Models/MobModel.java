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
public class MobModel extends Battler {
    public String NAME;
    
    public MobModel(String name, int one, int two, int three, int four, int five, int six) {
        super (one, two, three, four, five, six);
        this.NAME = name;
    }
}
