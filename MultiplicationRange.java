import java.util.Scanner;
public class MultiplicationRange {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int number = sc.nextInt();
int[] results = new int[4];
for (int i = 0; i < results.length; i++) {
results[i] = number * (i + 6);
}
for (int i = 0; i < results.length; i++) {
System.out.println(number + " * " + (i + 6) + " = " + results[i]);
}
}
}
