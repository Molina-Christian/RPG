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
public class ThaoDatabase {
    public final static String[] NAME = {
        "Thao Academy Entrance",
        "Thao Academy Courtyard",
        "Thao Academy Dormitory",
        "Thao Academy Cafeteria",
        "Thao Academy Teleporter",
        "Thao Academy Marketplace"
    };
    
    public final static String[] DESCRIPTION = {
        "A great wooden gate stands open. You can see many students pass "
            + "you on their way inside.",
        "A nice courtyard with a large fountain in the middle of it. You "
            + "can see students and staff walking around.",
        "A large stone building with a warm red paint and many windows "
            + "are visible, some of them closed off with curtains.",
        "A decent sized cafeteria with a rather overpowering smell of "
            + "slightly greasy food.",
        "A mystic design is etched into the floor behind a sturdy wooden "
            + "barrier. A teacher stand in front of the gate.",
        "A small marketplace with only a few shops. Clearly not meant "
            + "for more than a quick resupply location."
    };
    
    public static String getName(int which) {
        return NAME[which];
    }
    public static String getDesc(int which) {
        return DESCRIPTION[which];
    }
}
