package be.cegeka.battle;

public class Weapon {
    private final WeaponType weapon;

    public Weapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public WeaponType getWeaponType() {
        return weapon;
    }
}
