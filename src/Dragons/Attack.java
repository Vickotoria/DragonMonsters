package Dragons;

/**
 *
 */
public class Attack {
    private int damage;

    private Element elementType;

    /**
     * Creates an attack
     * @param damage the damage the attack does
     * @param type the type of attack
     */
    public Attack(int damage, Element type) {
        this.damage = damage;
        elementType = type;
    }

    //getters

    public int getDamage() {
        return damage;
    }

    public Element getAttType() {
        return elementType;
    }
}
