public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Cat", "Vasya", 1, "gray"))
        .addAnimal(new Horse("Horse", "Spirit", 10))
        .addAnimal(new Duck("Duck", "Donald", 5))
        .addAnimal(new Krokodile("Krokodile", "Boris", 16))
        .addAnimal(new Shark("Shark", "Razor", 8));

        System.out.println("----------------------------------------------------");
        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Sound of the zoo:");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.say());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Speed of run:");
        for (Runable runner : zoo1.getRunner()) {
            System.out.println("Speed is: " + runner.speedOfRun());
        }
        System.out.println("----------------------------------------------------");

        int max = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max of speed of run in the zoo is %d", max));

        System.out.println("----------------------------------------------------");
        for (Flyable flyer : zoo1.getFlyers()) {
            System.out.printf("Speed of fly: %d\n", flyer.speedOfFly());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Speed of swim:");
        for (Swimable swimer : zoo1.getSwimer()) {
            System.out.println("Speed is: " + swimer.speedOfSwim());
        }
        System.out.println("----------------------------------------------------");

        int max1 = zoo1.getChampionOfSwimers();
        System.out.println(String.format("Max speed of swim in the zoo is %d", max1));
        System.out.println("----------------------------------------------------");
    }
}
