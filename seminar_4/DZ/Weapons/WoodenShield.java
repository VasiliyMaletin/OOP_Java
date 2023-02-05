package DZ.Weapons;

import java.util.Objects;

public class WoodenShield extends Shield {

    public WoodenShield(int pointOfProtection) {
        super(pointOfProtection);
    }

    @Override
    public String toString() {
        return String.format("Shield protection = %d", pointOfProtection);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode("Wooden Shield" + pointOfProtection);
    }
}
