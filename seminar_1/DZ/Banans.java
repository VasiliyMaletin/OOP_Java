public class Banans extends Product {
    private String country;

    public Banans(String name, int price, int value, String country) {
        super(price, name, value);
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + ", Country: " + country;
    }
}
