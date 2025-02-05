import java.util.Scanner;
public class MultiplicationTable {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int number = sc.nextInt();
int[] results = new int[10];
for (int i = 0; i < results.length; i++) {
results[i] = number * (i + 1);
}
for (int i = 0; i < results.length; i++) {
System.out.println(number + " * " + (i + 1) + " = " + results[i]);
}
}
}
