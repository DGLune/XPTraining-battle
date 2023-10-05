package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> soldiers;

    public Army(Soldier frontSoldier) {
        soldiers = new ArrayList<>();
        soldiers.add(frontSoldier);
    }

    public void enlistSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public Soldier getFrontMan() {
        return soldiers.get(0);
    }
}
