package Trainers;

import Dragons.Monster;

import java.util.ArrayList;

public class Trainer {
    //private final int maxNumMon = 5; //todo
    private int initiative;
    private String name;

    private Monster activeMonster;
    private ArrayList<Monster> monsters;

    /**
     * Creates a trainer
     * @param name the name of the trainer
     */
    public Trainer(String name, int initiative) {
        this.initiative = initiative;
        this.name = name;

        monsters = new ArrayList<>(1);
    }

    /**
     * Adds a monster to the trainer
     * @param mon the monster to add
     */
    public void addMonster(Monster mon){
        monsters.add(mon);
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
    public Monster getActiveMonster(){
        return this.activeMonster;
    }

    /**
     * The monsters the trainer has
     * @return the monsters
     */
    public ArrayList<Monster> getMonsters() {
        return this.monsters;
    }
}
