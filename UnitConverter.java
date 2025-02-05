import java.util.Scanner;
public class UnitConverter {
public double convertYardsToFeet(double yards) {
double yards2feet = 3;
return yards * yards2feet;
}
public double convertFeetToYards(double feet) {
double feet2yards = 0.333333;
return feet * feet2yards;
}
public double convertMetersToInches(double meters) {
double meters2inches = 39.3701;
return meters * meters2inches;
}
public double convertInchesToMeters(double inches) {
double inches2meters = 0.0254;
return inches * inches2meters;
}
public double convertInchesToCm(double inches) {
double inches2cm = 2.54;
return inches * inches2cm;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
UnitConverter unitConverter = new UnitConverter();
System.out.print("Enter the value in yards to convert to feet: ");
double yards = sc.nextDouble();
System.out.println("Value in feet: " + unitConverter.convertYardsToFeet(yards));
System.out.print("Enter the value in feet to convert to yards: ");
double feet = sc.nextDouble();
System.out.println("Value in yards: " + unitConverter.convertFeetToYards(feet));
System.out.print("Enter the value in meters to convert to inches: ");
double meters = sc.nextDouble();
System.out.println("Value in inches: " + unitConverter.convertMetersToInches(meters));
System.out.print("Enter the value in inches to convert to meters: ");
double inches = sc.nextDouble();
System.out.println("Value in meters: " + unitConverter.convertInchesToMeters(inches));
System.out.print("Enter the value in inches to convert to centimeters: ");
inches = sc.nextDouble();
System.out.println("Value in centimeters: " + unitConverter.convertInchesToCm(inches));
sc.close();
}
}
