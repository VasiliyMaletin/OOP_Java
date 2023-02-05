// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
package DZ;

import java.util.List;

import DZ.Weapons.Shield;

public class Warrior {
    private String name;
    private int healthPoint;
    private List<Weaponable> weapon;
    private Shield shield;
    
    public Warrior(String name, int healthPoint, List<Weaponable> weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }
    
    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon(Weaponable weapon) {
        for(Weaponable weaponable : this.weapon) {
            if(weaponable.hashCode() == weapon.hashCode()) {
                return weapon;
            }
        }
        return null;
    }

    public List<Weaponable> getWeapons() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }
    
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + "]";
    }
}
