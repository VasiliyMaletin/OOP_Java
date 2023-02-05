package DZ.Weapons;

import java.util.Objects;

import DZ.Weaponable;

public abstract class Weapon implements Weaponable {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toString());
    }
}
