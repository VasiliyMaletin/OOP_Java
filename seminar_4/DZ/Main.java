// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
// Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
// На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п.
// У лучника добавить поле расстояние поражения. 
// Создать различные виды вооружения, например, меч, лук, лопата.
// Обеспечить, чтобы определенный тип воина мог нести только определенное оружие
// На основе работы на уроке. Создать класс щита, разработать разные типы щитов, 
// добавить в семейство классов Warriors обобщения в виде щитов. 
// Реструктуризировать код в конечных классах семейства Warriors. 
// Добавить метод определения минимального щита в команде.
package DZ;

import DZ.Weapons.Bow;
import DZ.Weapons.IronShield;
import DZ.Weapons.SteelShield;
import DZ.Weapons.Sword;
import DZ.Weapons.WoodenShield;

public class Main {
    public static void main(String[] args) {
        Team <Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Vasya", 250, new Sword(25)))
        .addWarriorToTeam(new Swordman("John", 200, new Sword(50)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Jeck", 150, new Bow(100, 50), null))
        .addWarriorToTeam(new Archer("Ray", 200, new Bow(75, 70), null));

        for (Archer person : team2) {
            System.out.println(person);
        }

        System.out.println("максимальная дальность team1" + team1.maxTeamRange());
        System.out.println("максимальная дальность team2" + team2.maxTeamRange());

        Team <ShieldBearer> team3 = new Team<>();
        team3.addWarriorToTeam(new ShieldBearer("Kolya", 150, new Sword(75), new WoodenShield(30)))
                .addWarriorToTeam(new ShieldBearer("Paul", 200, new Sword(55), new IronShield(75)))
                .addWarriorToTeam(new ShieldBearer("Poll", 250, new Sword(65), new SteelShield(75)));
        for (ShieldBearer person : team3) {
            System.out.println(person);
        }
        System.out.println("Минимальный щит team3: " + team3.minTeamShield());
    }
}
