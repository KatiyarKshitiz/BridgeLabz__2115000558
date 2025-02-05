import java.util.Scanner;
public class FactorCalculatorL2 {
public static int[] findFactors(int n) {
int count = 0;
for (int i = 1; i <= n; i++) {
if (n % i == 0) count++;
}
int[] factors = new int[count];
int index = 0;
for (int i = 1; i <= n; i++) {
if (n % i == 0) factors[index++] = i;
}
return factors;
}
public static int sumOfFactors(int[] factors) {
int sum = 0;
for (int factor : factors) sum += factor;
return sum;
}
public static long productOfFactors(int[] factors) {
long product = 1;
for (int factor : factors) product *= factor;
return product;
}
public static double sumOfSquares(int[] factors) {
double sum = 0;
for (int factor : factors) sum += Math.pow(factor, 2);
return sum;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int[] factors = findFactors(n);
System.out.println("Factors: ");
for (int factor : factors) System.out.print(factor + " ");
System.out.println("\nSum of factors: " + sumOfFactors(factors));
System.out.println("Product of factors: " + productOfFactors(factors));
System.out.println("Sum of square of factors: " + sumOfSquares(factors));
}
}
