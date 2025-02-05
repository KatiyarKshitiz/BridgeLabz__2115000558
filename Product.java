class Product {
private static double discount = 10.0;
private final String productID;
private String productName;
private double price;
private int quantity;

public Product(String productID, String productName, double price, int quantity) {
this.productID = productID;
this.productName = productName;
this.price = price;
this.quantity = quantity;
}

public static void updateDiscount(double newDiscount) {
discount = newDiscount;
}

public void displayProductDetails() {
if (this instanceof Product) {
System.out.println("Product Name: " + productName);
System.out.println("Product ID: " + productID);
System.out.println("Price: " + price);
System.out.println("Quantity: " + quantity);
System.out.println("Discount: " + discount + "%");
} else {
System.out.println("Invalid object type.");
}
}

public static void main(String[] args) {
Product prod1 = new Product("P001", "Laptop", 80000, 2);
Product prod2 = new Product("P002", "Smartphone", 50000, 5);
prod1.displayProductDetails();
System.out.println();
prod2.displayProductDetails();
Product.updateDiscount(15);
System.out.println("\nUpdated Discount: " + discount + "%");
}
}
