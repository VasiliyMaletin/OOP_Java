package DZ.Weapons;

import java.util.Objects;

public class SteelShield extends Shield {

    public SteelShield(int pointOfProtection) {
    super(pointOfProtection);
    }

    @Override
    public String toString() {
        return String.format("Shield protection = %d", pointOfProtection);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode("Steel Shield" + pointOfProtection);
    }
}
