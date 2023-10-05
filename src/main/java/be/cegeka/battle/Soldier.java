package be.cegeka.battle;


import com.google.common.base.Strings;

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

    public Soldier attack(Soldier loser) {
        return null;
    }
}
