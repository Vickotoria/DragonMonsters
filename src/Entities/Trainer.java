package Entities;

import Monsters.Monster;

import java.util.ArrayList;

public abstract class Trainer {
    //private final int maxNumMon = 5; //todo
    private String name;

    private ArrayList<Monster> monsters;

    /**
     * Creates a trainer
     * @param name the name of the trainer
     */
    protected Trainer(String name) {
        this.name = name;

        monsters = new ArrayList<>(2);
    }

    /**
     * Adds a monster to the trainer
     * @param mon the monster to add
     */
    public void addMonster(Monster mon){
        monsters.add(mon);
    }

    //getters

    /**
     * Get the name of the trainer
     * @return the name of the trainer
     */
    public String getName() {
        return name;
    }

    /**
     * The monsters the trainer has
     * @return the monsters
     */
    public ArrayList<Monster> getMonsters() {
        return monsters;
    }
}
