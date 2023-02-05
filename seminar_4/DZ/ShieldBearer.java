package DZ;

import DZ.Weapons.Shield;
import DZ.Weapons.Sword;

import java.util.List;
public class ShieldBearer extends Warrior{

    public ShieldBearer(String name, int healthPoint, Sword sword, Shield shield) {
        super(name, healthPoint, List.of(shield, sword));
    }

    @Override
    public String toString() {
        return "Shield Bearer, " + super.toString();
    }
}
