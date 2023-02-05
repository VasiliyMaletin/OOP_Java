package DZ;

import java.util.*;

import DZ.Weapons.Shield;

public class Team <E extends Warrior> implements Iterable<E>{
    private List<E> team = new ArrayList<>();
    
    public Team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if(item instanceof Archer) {
                if(((Archer)item).shotRange() > maxRange) maxRange = ((Archer)item).shotRange();
            }
        }
        return maxRange;
    }

    public int minTeamShield() {
        int minPointOfProtection = Integer.MAX_VALUE;
        for (E item : team) {
            for(Weaponable weapon : item.getWeapons()) {
                if(weapon instanceof Shield) {

                      if(minPointOfProtection > ((Shield) weapon).getPointOfProtection()) {
                        minPointOfProtection = ((Shield) weapon).getPointOfProtection();
                      }
                }
            }
        }
        return minPointOfProtection;
    }
}
