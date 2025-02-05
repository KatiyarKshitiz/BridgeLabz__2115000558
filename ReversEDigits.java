import java.util.Scanner;
public class ReversEDigits {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int number = sc.nextInt();
int count = 0;
int temp = number;
while (temp != 0) {
count++;
temp /= 10;
}
int[] digits = new int[count];
for (int i = 0; i < count; i++) {
digits[i] = number % 10;
number /= 10;
}
System.out.println("Reversed number is:");
for (int i = 0; i < count; i++) {
System.out.print(digits[i]);
}
}
}
