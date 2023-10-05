package be.cegeka.battle;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SoldierTest {

    @Test
    void construction_aSoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test
    void construction_aSoldierMustHaveAName_cannotBeNull() {
        assertThatThrownBy(() -> new Soldier(null))
                .hasMessage("A soldier must have a name")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void construction_aSoldierMustHaveAName_cannotBeEmpty() {
        assertThatThrownBy(() -> new Soldier(""))
                .hasMessage("A soldier must have a name")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void construction_aSoldierMustHaveAName_cannotBeBlank() {
        assertThatThrownBy(() -> new Soldier("     "))
                .hasMessage("A soldier must have a name")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void construction_aSoldierMustHaveADefaultWeapon_mustBeBareFist() {
        Soldier soldier = new Soldier("soldier");

        assertThat(soldier.getWeapon()).isEqualTo(Weapon.BAREFISTS);
    }

    @Test
    void attack_given2Soldiers_thenSoldierWithStrongestWeaponWins() {
        Soldier winner = new Soldier("The winner", Weapon.AXE);
        Soldier loser = new Soldier("The loser");

        Soldier actual = winner.fight(loser);

        Assertions.assertThat(actual).isEqualTo(winner);

    }

    @Test
    void attack_given2SoldiersWithEqualDamage_thenAttackerWins() {
        Soldier attacker = new Soldier("The winner");
        Soldier soldier = new Soldier("The loser");

        Soldier actual = attacker.fight(soldier);

        Assertions.assertThat(actual).isEqualTo(attacker);
    }


    @Test
    void army_givenAnArmyWithSoldiers_thenTheFirstOneIsTheFrontMan() {
        Soldier frontSoldier = new Soldier("The front soldier");
        Army army = new Army(frontSoldier);
        army.enlistSoldier(new Soldier("Soldier 2"));
        army.enlistSoldier(new Soldier("Soldier 3"));
        army.enlistSoldier(new Soldier("Soldier 1"));

        Soldier actual = army.getFrontMan();

        Assertions.assertThat(actual).isEqualTo(frontSoldier);
    }
}
