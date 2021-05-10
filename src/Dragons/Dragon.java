package Dragons;

import java.util.ArrayList;

/**
 * Describes a monster.
 */
public class Dragon {
    private String name;
    private Element elementType;

    private ArrayList<Attack> attacks;

    /**
     * Creates a monster
     * @param name the name of the monster
     * @param firstAttack the first attack of the monster
     */
    public Dragon(String name, Element elementType, Attack firstAttack) {
        this.name = name;
        this.elementType = elementType;

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

    public Element getElementType() {
        return elementType;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }
}
