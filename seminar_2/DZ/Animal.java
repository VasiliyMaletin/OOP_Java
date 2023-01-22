// Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее. 
// Родитель имеет в себе общие данные (пример: кличка, количествор лап, какие звуки издают и тд), 
// а наследники собственные параметры (тип перемещения).
public abstract class Animal implements Speakable {
    private String classAnimal;
    private String name;
    private int box;

    public Animal(String classAnimal, String name, int box) {
        this.classAnimal = classAnimal;
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return String.format("Class: %s, Name: %s, Box: %d", this.classAnimal, this.name, this.box);
    }
    
    public abstract String say();
}
