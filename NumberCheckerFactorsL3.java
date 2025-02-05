import java.util.ArrayList;
public class NumberCheckerFactorsL3 {
public static int[] findFactors(int number) {
ArrayList<Integer> factors = new ArrayList<>();
for (int i = 1; i <= number; i++) {
if (number % i == 0) factors.add(i);
}
return factors.stream().mapToInt(Integer::intValue).toArray();
}
public static int findSumOfFactors(int[] factors) {
int sum = 0;
for (int factor : factors) {
sum += factor;
}
return sum;
}
public static boolean isPerfectNumber(int number) {
int[] factors = findFactors(number);
return findSumOfFactors(factors) - number == number;
}
public static boolean isAbundantNumber(int number) {
int[] factors = findFactors(number);
return findSumOfFactors(factors) - number > number;
}
public static boolean isDeficientNumber(int number) {
int[] factors = findFactors(number);
return findSumOfFactors(factors) - number < number;
}
public static boolean isStrongNumber(int number) {
int[] digits = NumberCheckerDigitsL3.getDigits(number);
int sum = 0;
for (int digit : digits) {
sum += factorial(digit);
}
return sum == number;
}
public static int factorial(int number) {
int fact = 1;
for (int i = 1; i <= number; i++) {
fact *= i;
}
return fact;
}
public static void main(String[] args) {
int number = 6;
System.out.println("Is Perfect Number: " + isPerfectNumber(number));
System.out.println("Is Abundant Number: " + isAbundantNumber(number));
System.out.println("Is Deficient Number: " + isDeficientNumber(number));
System.out.println("Is Strong Number: " + isStrongNumber(number));
}
}
