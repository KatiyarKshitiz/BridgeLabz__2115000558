import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
int originalNumber = number;
int sum = 0;
while (originalNumber != 0) {
int digit = originalNumber % 10;
sum += digit * digit * digit;
originalNumber /= 10;
}
if (sum == number) {
System.out.println(number + " is an Armstrong number.");
} else {
System.out.println(number + " is not an Armstrong number.");
}
scanner.close();
}
}
