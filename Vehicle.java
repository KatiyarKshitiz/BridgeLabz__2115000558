class Vehicle {
private static double registrationFee = 500.0;
private final String registrationNumber;
private String ownerName;
private String vehicleType;

public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
this.registrationNumber = registrationNumber;
this.ownerName = ownerName;
this.vehicleType = vehicleType;
}

public static void updateRegistrationFee(double newFee) {
registrationFee = newFee;
}

public void displayVehicleDetails() {
if (this instanceof Vehicle) {
System.out.println("Owner Name: " + ownerName);
System.out.println("Vehicle Type: " + vehicleType);
System.out.println("Registration Number: " + registrationNumber);
System.out.println("Registration Fee: " + registrationFee);
} else {
System.out.println("Invalid object type.");
}
}

public static void main(String[] args) {
Vehicle vehicle1 = new Vehicle("V001", "Prachi", "Car");
Vehicle vehicle2 = new Vehicle("V002", "Kshitiz", "Bike");
vehicle1.displayVehicleDetails();
System.out.println();
vehicle2.displayVehicleDetails();
Vehicle.updateRegistrationFee(750);
System.out.println("\nUpdated Registration Fee: " + registrationFee);
}
}

