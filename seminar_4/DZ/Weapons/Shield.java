package DZ.Weapons;

import DZ.Weaponable;

public class Shield implements Weaponable {
    protected int pointOfProtection;

    public Shield(int pointOfProtection) {
        this.pointOfProtection = pointOfProtection;
    }

    public int getPointOfProtection() {
        return pointOfProtection;
    }

    @Override
    public String toString() {
        return String.format("Shield protection = %d", pointOfProtection);
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int protection() {
        return 0;
    }
}