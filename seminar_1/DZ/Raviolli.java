public class Raviolli extends Product {
    private int amount;

    public Raviolli(String name, int price, int value, int amount) {
        super(price, name, value);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Amount: " + amount;
    }

}
