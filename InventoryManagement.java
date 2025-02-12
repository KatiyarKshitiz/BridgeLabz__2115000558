import java.util.*;
class ItemNode {
String id, name;
int quantity;
double price;
ItemNode next;
ItemNode(String id, String name, int quantity, double price) {
this.id = id;
this.name = name;
this.quantity = quantity;
this.price = price;
this.next = null;
}
}
class InventoryLinkedList {
ItemNode head;
void addItem(String id, String name, int quantity, double price) {
ItemNode newNode = new ItemNode(id, name, quantity, price);
newNode.next = head;
head = newNode;
}
void removeItem(String id) {
ItemNode temp = head, prev = null;
if (temp != null && temp.id.equals(id)) {
head = temp.next;
return;
}
while (temp != null && !temp.id.equals(id)) {
prev = temp;
temp = temp.next;
}
if (temp == null) return;
prev.next = temp.next;
}
void displayInventory() {
ItemNode temp = head;
while (temp != null) {
System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
temp = temp.next;
}
}
}
public class InventoryManagement {
public static void main(String[] args) {
InventoryLinkedList inventory = new InventoryLinkedList();
inventory.addItem("I101", "Laptop", 5, 750.50);
inventory.addItem("I102", "Phone", 10, 500.00);
inventory.displayInventory();
inventory.removeItem("I101");
inventory.displayInventory();
}
}
