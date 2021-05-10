package Trainers;

import Dragons.Dragon;

import java.util.ArrayList;

public class Trainer {
    //private final int maxNumDragons = 5; //todo
    private int initiative;
    private String name;

    private Dragon activeDragon;
    private ArrayList<Dragon> dragons;

    /**
     * Creates a trainer
     * @param name the name of the trainer
     */
    public Trainer(String name, int initiative) {
        this.initiative = initiative;
        this.name = name;

        dragons = new ArrayList<>(1);
    }

    /**
     * Adds a monster to the trainer
     * @param mon the monster to add
     */
    public void addMonster(Dragon mon){
        dragons.add(mon);
    }

    /**
     * Changes the active dragon of the trainer
     */
    public void changeActiveMonster(){
        //todo
    }

    //getters

    /**
     * Get the name of the trainer
     * @return the name of the trainer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the active dragon of the trainer
     * @return the active dragon
     */
    public Dragon getActiveDragon(){
        return this.activeDragon;
    }

    /**
     * The dragons the trainer has
     * @return the dragons
     */
    public ArrayList<Dragon> getDragons() {
        return this.dragons;
    }
}
