import java.util.Scanner;
public class YoungestAndTallest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int maxDigit = 10, index = 0;
int[] digits = new int[maxDigit];
System.out.println("Enter a number:");
int number = sc.nextInt();
while (number != 0) {
if (index == maxDigit) {
maxDigit += 10;
int[] temp = new int[maxDigit];
for (int i = 0; i < digits.length; i++) {
temp[i] = digits[i];
}
digits = temp;
}
digits[index++] = number % 10;
number /= 10;
}
int largest = digits[0], secondLargest = Integer.MIN_VALUE;
for (int i = 1; i < index; i++) {
if (digits[i] > largest) {
secondLargest = largest;
largest = digits[i];
} else if (digits[i] > secondLargest && digits[i] != largest) {
secondLargest = digits[i];
}
}
System.out.println("Largest digit: " + largest);
System.out.println("Second largest digit: " + secondLargest);

int[] age = new int[3];
int[] height = new int[3];
System.out.println("Enter ages of Amar, Akbar, and Anthony:");
for (int i = 0; i < 3; i++) {
age[i] = sc.nextInt();
}
System.out.println("Enter heights of Amar, Akbar, and Anthony:");
for (int i = 0; i < 3; i++) {
height[i] = sc.nextInt();
}
int youngestIndex = 0, tallestIndex = 0;
for (int i = 1; i < 3; i++) {
if (age[i] < age[youngestIndex]) {
youngestIndex = i;
}
if (height[i] > height[tallestIndex]) {
tallestIndex = i;
}
}
System.out.println("Youngest friend is friend " + (youngestIndex + 1));
System.out.println("Tallest friend is friend " + (tallestIndex + 1));
}
}
