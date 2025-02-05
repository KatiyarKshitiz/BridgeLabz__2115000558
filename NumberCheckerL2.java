import java.util.Scanner;
public class NumberCheckerL2 {
public static boolean isPositive(int num) {
return num > 0;
}
public static boolean isEven(int num) {
return num % 2 == 0;
}
public static int compareNumbers(int num1, int num2) {
if (num1 > num2) return 1;
if (num1 == num2) return 0;
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] numbers = new int[5];
for (int i = 0; i < 5; i++) {
System.out.print("Enter number " + (i + 1) + ": ");
numbers[i] = sc.nextInt();
if (isPositive(numbers[i])) {
System.out.println("Positive");
System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
} else {
System.out.println("Negative");
}
}
int comparison = compareNumbers(numbers[0], numbers[4]);
if (comparison > 0) System.out.println("First is greater");
else if (comparison == 0) System.out.println("First and last are equal");
else System.out.println("First is less");
}
}
