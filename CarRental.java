class CarRental {
String customerName;
String carModel;
int rentalDays;
double totalCost;
CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
this.customerName = customerName;
this.carModel = carModel;
this.rentalDays = rentalDays;
this.totalCost = rentalDays * dailyRate;
}
public static void main(String[] args) {
CarRental rental = new CarRental("Alice", "Sedan", 5, 50.0);
System.out.println(rental.customerName + " rented a " + rental.carModel + " for " + rental.rentalDays + " days. Total cost: $" + rental.totalCost);
}
}
