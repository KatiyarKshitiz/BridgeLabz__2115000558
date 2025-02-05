import java.util.Scanner;
public class DigitFrequency {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int number = sc.nextInt();
int temp = number, count = 0;
while (temp != 0) {
count++;
temp /= 10;
}
int[] digits = new int[count];
for (int i = 0; i < count; i++) {
digits[i] = number % 10;
number /= 10;
}
int[] frequency = new int[10];
for (int i = 0; i < count; i++) {
frequency[digits[i]]++;
}
System.out.println("Frequency of each digit:");
for (int i = 0; i < 10; i++) {
if (frequency[i] > 0) {
System.out.println("Digit " + i + ": " + frequency[i]);
}
}
}
}
