import java.util.Scanner;
public class NumberCheck {
public static void main(String[] args) {
int[] numbers = new int[5];
Scanner sc = new Scanner(System.in);
for (int i = 0; i < numbers.length; i++) {
System.out.println("Enter the number: ");
numbers[i] = sc.nextInt();
}
for (int number : numbers) {
if (number > 0) {
if (number % 2 == 0) {
System.out.println(number + " is positive and even");
} else {
System.out.println(number + " is positive and odd");
}
} else if (number < 0) {
System.out.println(number + " is negative");
} else {
System.out.println(number + " is zero");
}
}
if (numbers[0] == numbers[4]) {
System.out.println("First and last elements are equal");
} else if (numbers[0] > numbers[4]) {
System.out.println("First element is greater than the last");
} else {
System.out.println("First element is less than the last");
}
}
}


