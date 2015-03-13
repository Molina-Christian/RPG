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
class Battler {
    public int STR;
    public int CON;
    public int DEX;
    public int INT;
    public int WIS;
    public int LUC;
    
    public int HP;
    public int MAX_HP;
    public int MP;
    public int MAX_MP;
    
    public int ATK;
    public int DEF;
    public int M_ATK;
    public int M_DEF;
    public int SPD;
    
    Battler(int one, int two, int three, int four, int five, int six) {
        this.STR = one;
        this.CON = two;
        this.DEX = three;
        this.INT = four;
        this.WIS = five;
        this.LUC = six;
        
        this.HP = this.CON * 10;
        this.MAX_HP = this.HP;
        this.MP = this.INT * 10;
        this.MAX_MP = this.MP;
        
        this.ATK = (this.STR * 3) / 2;
        this.DEF = (this.CON * 3) / 2;
        this.M_ATK = (this.INT * 3) / 2;
        this.M_DEF = (this.WIS * 3) / 2;
        this.SPD = (this.DEX * 3) / 2;
    }
    
    public int getSTR() {
        return STR;
    }
    public int getCON() {
        return CON;
    }
    public int getDEX() {
        return DEX;
    }
    public int getINT() {
        return INT;
    }
    public int getWIS() {
        return WIS;
    }
    public int getLUC() {
        return LUC;
    }
    
    public int getHP() {
        return HP;
    }
    public int getMaxHP() {
        return MAX_HP;
    }
    public int getMP() {
        return MP;
    }
    public int getMaxMP() {
        return MAX_MP;
    }
    
    public int getATK() {
        return ATK;
    }
    public int getDEF() {
        return DEF;
    }
    public int getMAtk() {
        return M_ATK;
    }
    public int getMDef() {
        return M_DEF;
    }
    public int getSPD() {
        return SPD;
    }
}
