public class Duck extends Animal implements Runable, Flyable, Swimable {

    public Duck(String classAnimal, String name, int box) {
        super(classAnimal, name, box);
    }

    @Override
    public String say() {
        return "Say: Кря-кря";
    }

    @Override
    public int speedOfFly() {
        return 40;
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 20;
    }
}
