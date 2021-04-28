package Monsters;

import java.util.ArrayList;

/**
 * Describes a monster.
 */
public class Monster {
    private String name;

    private ArrayList<Attack> attacks;

    /**
     * Creates a monster
     * @param name the name of the monster
     * @param firstAttack the first attack of the monster
     */
    public Monster(String name, Attack firstAttack) {
        this.name = name;

        attacks = new ArrayList<>(1);
        addAttack(firstAttack);
    }

    public void addAttack(Attack attack){
        attacks.add(attack);
    }

    //getters

    public String getName() {
        return name;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }
}
