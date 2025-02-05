import java.util.*;
class TemperatureConverter {
public static double toCelsius(double f) {
return (f - 32) * 5 / 9;
}
public static double toFahrenheit(double c) {
return (c * 9 / 5) + 32;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter temperature:");
double temp = sc.nextDouble();
System.out.println("Convert to (C/F):");
char unit = sc.next().charAt(0);
System.out.println(unit == 'C' ? toCelsius(temp) : toFahrenheit(temp));
}
}
