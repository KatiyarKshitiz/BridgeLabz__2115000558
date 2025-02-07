interface Refuelable {
void refuel();
}
class Vehicle {
int maxSpeed;
String model;
Vehicle(int maxSpeed, String model) {
this.maxSpeed = maxSpeed;
this.model = model;
}
void displayInfo() {
System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
}
}
class ElectricVehicle extends Vehicle {
ElectricVehicle(int maxSpeed, String model) {
super(maxSpeed, model);
}
void charge() {
System.out.println(model + " is charging.");
}
}
class PetrolVehicle extends Vehicle implements Refuelable {
PetrolVehicle(int maxSpeed, String model) {
super(maxSpeed, model);
}
@Override
public void refuel() {
System.out.println(model + " is being refueled.");
}
}
public class VehicleManagement {
public static void main(String[] args) {
ElectricVehicle tesla = new ElectricVehicle(200, "Tesla Model S");
PetrolVehicle honda = new PetrolVehicle(180, "Honda Civic");
tesla.displayInfo();
tesla.charge();
honda.displayInfo();
honda.refuel();
}
}
