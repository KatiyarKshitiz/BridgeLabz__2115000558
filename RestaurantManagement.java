interface Worker {
void performDuties();
}
class Person {
String name;
int id;
Person(String name, int id) {
this.name = name;
this.id = id;
}
void displayDetails() {
System.out.println("Name: " + name + ", ID: " + id);
}
}
class Chef extends Person implements Worker {
Chef(String name, int id) {
super(name, id);
}
@Override
public void performDuties() {
System.out.println(name + " is preparing dishes.");
}
}
class Waiter extends Person implements Worker {
Waiter(String name, int id) {
super(name, id);
}
@Override
public void performDuties() {
System.out.println(name + " is serving food to customers.");
}
}
public class RestaurantManagement {
public static void main(String[] args) {
Chef chef = new Chef("Naiza Paul", 101);
Waiter waiter = new Waiter("Sumit", 201);
chef.displayDetails();
chef.performDuties();
waiter.displayDetails();
waiter.performDuties();
}
}
