package DZ;

import java.util.List;

import DZ.Weapons.Sword;

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword) {
        super(name, healthPoint, List.of(sword));
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }   
}
