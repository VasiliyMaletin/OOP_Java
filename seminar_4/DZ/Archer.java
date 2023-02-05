package DZ;

import java.util.List;

import DZ.Weapons.Bow;
import DZ.Weapons.Shield;

public class Archer extends Warrior {

    private Bow bow;
    public Archer(String name, int healthPoint, Bow bow, Shield shield) {
        super(name, healthPoint, List.of(bow));
    this.bow = bow;
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon(bow)).getRange();
    }  
}
