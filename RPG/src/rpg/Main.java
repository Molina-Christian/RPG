/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import rpg.Frames.*;

/**
 *
 * @author Christian
 */
public class Main {
    //public static final Thao thao = new Thao();
    //public static final Outside outside = new Outside();
    
    //public static void main(String[] args) {
        //thao.setVisible(false);
        //outside.setVisible(false);
        //AkashicTrials game = new AkashicTrials();
      //  game.setVisible(true);
    //}
    
    public static String convertArray(String[][] array) {
        String output = "";
        for (String[] array1 : array) {
            output += array1[0] + "\t" + array1[1] + "\n";
        }
        return output;
    }
}
