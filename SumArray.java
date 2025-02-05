import java.util.Scanner;
public class SumArray {
public static void main(String[] args) {
double[] numbers = new double[10];
double total = 0.0;
int index = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers: ");
while (true) {
double input = sc.nextDouble();
if (input <= 0 || index == 10) break;
numbers[index++] = input;
}
for (int i = 0; i < index; i++) {
total += numbers[i];
}
System.out.println("Sum of numbers: " + total);
}
}
