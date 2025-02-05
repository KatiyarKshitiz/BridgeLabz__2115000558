import java.util.Scanner;
public class SumOfNaturalNumbers {
public static int findSum(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i;
}
return sum;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = scanner.nextInt();
System.out.println(findSum(n));
}
}
