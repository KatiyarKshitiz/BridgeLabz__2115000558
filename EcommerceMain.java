import java.util.*;
class Product {
String name;
double price;
Product(String name, double price) {
this.name = name;
this.price = price;
}
}
class Order {
List<Product> products = new ArrayList<>();
void addProduct(Product product) {
products.add(product);
}
}
class EcommerceCustomer {
String name;
List<Order> orders = new ArrayList<>();
EcommerceCustomer(String name) {
this.name = name;
}
void placeOrder(Order order) {
orders.add(order);
}
}
public class EcommerceMain {
public static void main(String[] args) {
Product product1 = new Product("Laptop", 1000);
Product product2 = new Product("Phone", 500);
Order order = new Order();
order.addProduct(product1);
order.addProduct(product2);
EcommerceCustomer customer = new EcommerceCustomer("Prachi");
customer.placeOrder(order);
for (Order ord : customer.orders) {
for (Product prod : ord.products) {
System.out.println(prod.name + " - $" + prod.price);
}
}
}
}
