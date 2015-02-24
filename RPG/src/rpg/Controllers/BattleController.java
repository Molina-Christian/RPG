/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Controllers;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Christian
 */
public class BattleController {
    Scanner input = new Scanner(System.in);
    static Random roll = new Random();
    private static Boolean over = false;
    private static int choice;
    private static int damage;
    public static Boolean run = false;
    public static Boolean[] playerDefend = new Boolean[4];
    public static Boolean[] mobDefend = new Boolean[6];
    
    public void playerAttack(int who) {
        switch (who) {
            case 1:
                System.out.println("Select a target...");
                for (int i=0;i<PartyController.mobs.length;i++) {
                    if (PartyController.mobs[i] != null) {
                        System.out.println((i+1) + ". " + PartyController.mobs[i]);
                    }
                }
                choice = input.nextInt();
                while (!over) {
                    switch (choice) {
                        case 1:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 2:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 3:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 4:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 5:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 6:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[5] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        default:
                            System.out.println("That is not a choice...");
                    }
                }
                break;
            case 2:
                System.out.println("Select a target...");
                for (int i=0;i<PartyController.mobs.length;i++) {
                    if (PartyController.mobs[i] != null) {
                        System.out.println((i+1) + ". " + PartyController.mobs[i]);
                    }
                }
                choice = input.nextInt();
                while (!over) {
                    switch (choice) {
                        case 1:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 2:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 3:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 4:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 5:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 6:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[5] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        default:
                            System.out.println("That is not a choice...");
                    }
                }
                break;
            case 3:
                System.out.println("Select a target...");
                for (int i=0;i<PartyController.mobs.length;i++) {
                    if (PartyController.mobs[i] != null) {
                        System.out.println((i+1) + ". " + PartyController.mobs[i]);
                    }
                }
                choice = input.nextInt();
                while (!over) {
                    switch (choice) {
                        case 1:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 2:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 3:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 4:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 5:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 6:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[5] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        default:
                            System.out.println("That is not a choice...");
                    }
                }
                break;
            case 4:
                System.out.println("Select a target...");
                for (int i=0;i<PartyController.mobs.length;i++) {
                    if (PartyController.mobs[i] != null) {
                        System.out.println((i+1) + ". " + PartyController.mobs[i]);
                    }
                }
                choice = input.nextInt();
                while (!over) {
                    switch (choice) {
                        case 1:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 2:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 3:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 4:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 5:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[choice-1] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        case 6:
                            if (PartyController.partyNum[who-1][8] >= PartyController.mobsNum[choice-1][8]) {
                                damage = PartyController.partyNum[who-1][4] - PartyController.mobsNum[choice-1][5];
                                if (damage < 0) {
                                    System.out.println(PartyController.party[who-1] + " did no damage!");
                                } else {
                                    PartyController.mobsNum[choice-1][0] -= damage;
                                    System.out.println(PartyController.party[who-1] + " did " + damage + " damage to " + PartyController.mobs[5] + "!");
                                }
                            } else {
                                System.out.println(PartyController.party[who-1] + " missed...");
                            }
                            over = true;
                            break;
                        default:
                            System.out.println("That is not a choice...");
                    }
                }
                break;
        }
    }
    public void playerSkill(int who) {
        
    }
    public void playerDefend(int who) {
        switch (who) {
            case 1:
                PartyController.partyNum[0][8] *= 2;
                playerDefend[0] = true;
            case 2:
                PartyController.partyNum[1][8] *= 2;
                playerDefend[1] = true;
            case 3:
                PartyController.partyNum[2][8] *= 2;
                playerDefend[2] = true;
            case 4:
                PartyController.partyNum[3][8] *= 2;
                playerDefend[3] = true;
        }
    }
    public void runAway() {
        int average1 = 0;
        for (int i=0;i<4;i++) {
            average1 += PartyController.partyNum[i][8];
        }
        int average2 = 0;
        for (int i=0;i<6;i++) {
            average2 += PartyController.mobsNum[i][8];
        }
        if (average1 >= average2) {
            run = true;
        } else {
            System.out.println("The enemy stopped you from escaping!");
        }
         
    }
    
    public static void mobAttack(int who) {
        switch (who) {
            case 1:
                choice = roll.nextInt(PartyController.party.length);
                switch (choice) {
                    case 0:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 1:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 2:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 3:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                }
            case 2:
                choice = roll.nextInt(PartyController.party.length);
                switch (choice) {
                    case 0:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 1:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 2:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 3:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                }
            case 3:
                choice = roll.nextInt(PartyController.party.length);
                switch (choice) {
                    case 0:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 1:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 2:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 3:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                }
            case 4:
                choice = roll.nextInt(PartyController.party.length);
                switch (choice) {
                    case 0:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 1:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 2:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 3:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                }
            case 5:
                choice = roll.nextInt(PartyController.party.length);
                switch (choice) {
                    case 0:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 1:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 2:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 3:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                }
            case 6:
                choice = roll.nextInt(PartyController.party.length);
                switch (choice) {
                    case 0:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 1:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 2:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                    case 3:
                        if (PartyController.mobsNum[who-1][8] >= PartyController.partyNum[choice][8]) {
                            damage = PartyController.mobsNum[who-1][4] - PartyController.partyNum[choice][5];
                            if (damage < 0) {
                                System.out.println(PartyController.mobs[who-1] + " did no damage...");
                            } else {
                                PartyController.partyNum[choice][1] -= damage;
                                System.out.println(PartyController.party[choice] + " took " + damage + " damage!");
                            }
                        } else {
                            System.out.println(PartyController.mobs[who-1] + " missed...");
                        }
                }
        }
    }
    public static void mobSkill(int who) {
        
    }
    public static void mobDefend(int who) {
        switch (who) {
            case 1:
                PartyController.mobsNum[0][8] *= 2;
                mobDefend[0] = true;
            case 2:
                PartyController.mobsNum[1][8] *= 2;
                mobDefend[1] = true;
            case 3:
                PartyController.mobsNum[2][8] *= 2;
                mobDefend[2] = true;
            case 4:
                PartyController.mobsNum[3][8] *= 2;
                mobDefend[3] = true;
            case 5:
                PartyController.mobsNum[4][8] *= 2;
                mobDefend[4] = true;
            case 6:
                PartyController.mobsNum[5][8] *= 2;
                mobDefend[5] = true;
        }
    }
}
