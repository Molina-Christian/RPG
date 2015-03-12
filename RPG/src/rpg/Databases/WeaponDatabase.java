/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Databases;

/**
 *
 * @author Christian
 */
public class WeaponDatabase {
    public final static String[] NAME = {
        "Long Sword",
        "Great Lance",
        "Wood Axe"
    };
    
    public final static String[] DESCRIPTION = {
        "A basic sword",
        "A basic lance",
        "A basic axe"
    };
    
    /*
    1: Swords
    2: Axes
    3: Hammers
    4: Staves
    5: Lances
    6: Fists
    7: Special
    */
    public final static int[] TYPE = {
        1,
        5,
        2
    };
    
    public final static int[] ATK = {
        5,
        7,
        10
    };
    
    public final static int[] ACC = {
        2,
        4,
        1
    };
    
    public final static int[] CRIT = {
        3,
        2,
        4
    };
    
    public final static int[] PRICE = {
        100,
        140,
        200
    };
}
