import java.util.Scanner;
import java.util.Random;
public class BMICalculator {
public double[][] calculateBMI(double[][] data) {
for (int i = 0; i < data.length; i++) {
double weight = data[i][0];
double heightInMeters = data[i][1] / 100;
data[i][2] = weight / (heightInMeters * heightInMeters);
}
return data;
}
public String[] determineBMIStatus(double[][] data) {
String[] status = new String[data.length];
for (int i = 0; i < data.length; i++) {
double bmi = data[i][2];
if (bmi <= 18.4) status[i] = "UnderWeight";
else if (bmi <= 24.9) status[i] = "Normal";
else if (bmi <= 39.9) status[i] = "OverWeight";
else status[i] = "Obese";
}
return status;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double[][] data = new double[10][3];
for (int i = 0; i < 10; i++) {
System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
data[i][0] = sc.nextDouble();
System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
data[i][1] = sc.nextDouble();
}
BMICalculator calculator = new BMICalculator();
data = calculator.calculateBMI(data);
String[] status = calculator.determineBMIStatus(data);
for (int i = 0; i < data.length; i++) {
System.out.println("Person " + (i + 1) + ": Height = " + data[i][1] + " cm, Weight = " + data[i][0] + " kg, BMI = " + data[i][2] + ", Status = " + status[i]);
}
sc.close();
}
}
