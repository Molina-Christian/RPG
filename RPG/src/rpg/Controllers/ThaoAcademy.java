/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

/**
 *
 * @author Christian
 */
public class ThaoAcademy {
    String talk;
    public String getTalk(int where) {
        switch (where) {
            case 0:
                talk = "\n\nI am talking outside.";
                break;
            case 1:
                talk = "\n\nI am talking inside.";
                break;
            case 2:
                talk = "\n\nI am talking at the dorms.";
                break;
            case 3:
                talk = "\n\nI am talking in the cafeteria.";
                break;
            case 4:
                talk = "\n\nI am talking in the teleporter.";
                break;
            case 5:
                talk = "\n\nI am talking in the market.";
                break;
        }
        return talk;
    }
    public void goToClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void room() {
        Game.time += 8;
        if (Game.time > 24) {
            Game.day++;
            Game.time -= 24;
        }
    }
    public void teleport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void weapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void magic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void item() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
