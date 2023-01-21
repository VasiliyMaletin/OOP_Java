public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(new Product(10, "Milk", 1000));
        vendingMachine.addProduct(new Product(20, "Bread", 500));
        vendingMachine.addProduct(new Raviolli("Palicha", 50, 450, 100));
        vendingMachine.addProduct(new Product(80, "Chocolate", 100));
        vendingMachine.addProduct(new Banans("Banans", 115, 300, "Brazil"));
        for (Product item : vendingMachine.getProducts()) {
            System.out.println(item);
        }

        Product found = vendingMachine.find("Palicha");
        System.out.printf("Search results: %s", found);
    }
}
