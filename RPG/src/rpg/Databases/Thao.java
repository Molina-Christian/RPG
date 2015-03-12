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
public class Thao {
    public final static String[] NAME = {
        "Thao Academy Entrance",
        "Thao Academy Courtyard",
        "Thao Academy Dormitory",
        "Thao Academy Cafeteria",
        "Thao Academy Teleporter",
        "Thao Academy Marketplace"
    };
    
    public final static String[] DESCRIPTION = {
        "A great wooden gate stands open. You can see many students pass\n"
            + "you on their way inside.",
        "A nice courtyard with a large fountain in the middle of it. You\n"
            + "can see students and staff walking around.",
        "A large stone building with a warm red paint and many windows\n"
            + "are visible, some of them closed off with curtains.",
        "A decent sized cafeteria with a rather overpowering smell of\n"
            + "slightly greasy food.",
        "A mystic design is etched into the floor behind a sturdy wooden\n"
            + "barrier. A teacher stand in front of the gate.",
        "A small marketplace with only a few shops. Clearly not meant\n"
            + "for more than a quick resupply location."
    };
    
    public static String getName(int which) {
        return NAME[which];
    }
    public static String getDesc(int which) {
        return DESCRIPTION[which];
    }
}
