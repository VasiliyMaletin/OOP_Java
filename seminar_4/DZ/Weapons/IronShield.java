package DZ.Weapons;

import java.util.Objects;

public class IronShield extends Shield {

    public IronShield(int pointOfProtection) {
        super(pointOfProtection);
    }

    @Override
    public String toString() {
        return String.format("Shield protection = %d", pointOfProtection);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode("Iron Shield" + pointOfProtection);
    }
}
