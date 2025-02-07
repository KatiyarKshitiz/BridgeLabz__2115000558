class Order {
int orderId;
String orderDate;
Order(int orderId, String orderDate) {
this.orderId = orderId;
this.orderDate = orderDate;
}
void getOrderStatus() {
System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
}
}
class ShippedOrder extends Order {
String trackingNumber;
ShippedOrder(int orderId, String orderDate, String trackingNumber) {
super(orderId, orderDate);
this.trackingNumber = trackingNumber;
}
void getOrderStatus() {
super.getOrderStatus();
System.out.println("Tracking Number: " + trackingNumber);
}
}
class DeliveredOrder extends ShippedOrder {
String deliveryDate;
DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
super(orderId, orderDate, trackingNumber);
this.deliveryDate = deliveryDate;
}
void getOrderStatus() {
super.getOrderStatus();
System.out.println("Delivery Date: " + deliveryDate);
}
}
public class RetailOrderManagement {
public static void main(String[] args) {
DeliveredOrder order = new DeliveredOrder(1001, "2025-02-01", "TR123456", "2025-02-05");
order.getOrderStatus();
}
}
