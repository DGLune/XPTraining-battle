package be.cegeka.battle;


import com.google.common.base.Strings;

import java.util.Objects;

public class Soldier {

    private final String name;
    private final Weapon weapon;


    public Soldier(String name, Weapon weapon) {
        //de isBlank methode omvat al de isEmpty check
        if (Strings.isNullOrEmpty(name) || name.isBlank()) {
            throw new IllegalArgumentException("A soldier must have a name");
        }
        this.name = name;
        this.weapon = weapon;
    }

    public Soldier(String naam) {
        this(naam, Weapon.BAREFISTS);
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Soldier fight(Soldier soldier) {
        if (this.weapon.getDamage() >= soldier.weapon.getDamage()) return this;
        return soldier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return Objects.equals(name, soldier.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
