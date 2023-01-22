public class Krokodile extends Animal implements Runable, Swimable {

    public Krokodile(String classAnimal, String name, int box) {
        super(classAnimal, name, box);
    }

    @Override
    public String say() {
        return "Say: Грррр";
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 40;
    }
}
