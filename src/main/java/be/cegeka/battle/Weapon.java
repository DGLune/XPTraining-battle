package be.cegeka.battle;

public abstract class Weapon {
    private WeaponType weapon;
    private final int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public WeaponType getWeaponType() {
        return null;
    }
}
