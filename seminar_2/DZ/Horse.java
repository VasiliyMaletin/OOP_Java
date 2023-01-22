public class Horse extends Animal implements Runable {

    public Horse(String classAnimal, String name, int box) {
        super(classAnimal, name, box);
    }

    @Override
    public String say() {
        return "Say: Игого";
    }

    @Override
    public String toString() {
        return "Horse " + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 60;
    }
}
