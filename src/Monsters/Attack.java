package Monsters;

/**
 *
 */
public class Attack {
    private int damage;

    private AttackType attType;

    /**
     * Creates an attack
     * @param damage the damage the attack does
     * @param type the type of attack
     */
    public Attack(int damage, AttackType type) {
        this.damage = damage;
        attType = type;
    }

    //getters

    public int getDamage() {
        return damage;
    }

    public AttackType getAttType() {
        return attType;
    }
}
