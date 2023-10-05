package be.cegeka.battle;

public enum Weapon {
    AXE(3),
    SWORD(2),
    SPEAR(2),
    BAREFISTS(1);

    private int damage;

    public int getDamage() {
        return damage;
    }

    Weapon(int damage) {
        this.damage = damage;
    }
}
