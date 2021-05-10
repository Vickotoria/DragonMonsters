package Misc;

import Trainers.Trainer;

public class Combat {
    private Trainer player;
    private Trainer enemy;

    /**
     * Constructs the Combat object. This object should be
     * constructed for each new fight.
     * @param player the player character
     * @param enemy the enemy of the player
     */
    public Combat(Trainer player, Trainer enemy){
        this.player = player;
        this.enemy = enemy;
    }

    /**
     * Begins the combat constructed
     * @return the winner
     */
    public Trainer beginCombat(){
        return new Trainer("The Winner", 42);
    }
}
