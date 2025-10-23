public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String initalName, double initialPrice, int initialQuantity) {
        name = initalName;
        quantity = initialQuantity;
        price = initialPrice;
    }

    public void printProduct() {
        System.out.println(name + "," + " price " + price + ", " + quantity + " pcs");
    }
}
