import java.util.Scanner;
public class OddEvenArrays {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int number = sc.nextInt();
if (number <= 0) return;
int[] odd = new int[number];
int[] even = new int[number];
int oddIndex = 0, evenIndex = 0;
for (int i = 1; i <= number; i++) {
if (i % 2 == 0) {
even[evenIndex++] = i;
} else {
odd[oddIndex++] = i;
}
}
for (int i = 0; i < oddIndex; i++) {
System.out.println("Odd: " + odd[i]);
}
for (int i = 0; i < evenIndex; i++) {
System.out.println("Even: " + even[i]);
}
}
}
