package Entities;

import Monsters.Monster;

/**
 * The player character
 */
public class Player extends Trainer {
    //

    /**
     * Creates the player character
     * @param name the name of the player character
     * @param start1 the first start monster
     * @param start2 the second start monster
     */
    public Player(String name, Monster start1, Monster start2) {
        super(name);

        addMonster(start1);
        addMonster(start2);
    }
}
