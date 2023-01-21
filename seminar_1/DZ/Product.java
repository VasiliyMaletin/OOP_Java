public class Product {
    private int price;
    private String name;
    private int value;

    public Product(int price, String name, int value) {
        this.price = price;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, Price: %d, Value: %s ", name, price, value);
    }
}
