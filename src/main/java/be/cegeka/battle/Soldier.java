package be.cegeka.battle;


import com.google.common.base.Strings;

public class Soldier {

    private final String name;


    public Soldier(String name) {
        if (Strings.isNullOrEmpty(name) || name.isBlank()) {
            throw new IllegalArgumentException("A soldier must have a name");
        }
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return null;
    }
}
