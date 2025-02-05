import java.util.Scanner;
public class UnitConverter4L2 {
public static double convertKmToMiles(double km) {
return km * 0.621371;
}
public static double convertMilesToKm(double miles) {
return miles * 1.60934;
}
public static double convertMetersToFeet(double meters) {
return meters * 3.28084;
}
public static double convertFeetToMeters(double feet) {
return feet * 0.3048;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Choose conversion type: 1. Km to Miles 2. Miles to Km 3. Meters to Feet 4. Feet to Meters");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter kilometers: ");
double km = scanner.nextDouble();
System.out.println("Miles: " + convertKmToMiles(km));
break;
case 2:
System.out.print("Enter miles: ");
double miles = scanner.nextDouble();
System.out.println("Kilometers: " + convertMilesToKm(miles));
break;
case 3:
System.out.print("Enter meters: ");
double meters = scanner.nextDouble();
System.out.println("Feet: " + convertMetersToFeet(meters));
break;
case 4:
System.out.print("Enter feet: ");
double feet = scanner.nextDouble();
System.out.println("Meters: " + convertFeetToMeters(feet));
break;
default:
System.out.println("Invalid choice");
}
scanner.close();
}
}
