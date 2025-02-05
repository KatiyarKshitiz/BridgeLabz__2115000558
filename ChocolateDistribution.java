import java.util.Scanner;
public class ChocolateDistribution {
public static int[] findRemainderAndQuotient(int number, int divisor) {
int quotient = number / divisor;
int remainder = number % divisor;
return new int[]{quotient, remainder};
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of chocolates: ");
int numberOfChocolates = scanner.nextInt();
System.out.print("Enter the number of children: ");
int numberOfChildren = scanner.nextInt();
int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
System.out.println("Chocolates per child: " + result[0] + ", Remaining chocolates: " + result[1]);
}
}
