public class Cat extends Animal implements Runable {

    private String color;

    public Cat(String classAnimal, String name, int box, String color) {
        super(classAnimal, name, box);
        this.color = color;
    }

    @Override
    public String say() {
        return "Say: Мяу";
    }

    @Override
    public String toString() {
        return "Cat " + super.toString() + ", Color: " + color;
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}
