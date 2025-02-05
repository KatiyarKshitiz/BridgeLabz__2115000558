public class NumberCheckerSpecialL3 {
public static boolean isPrime(int number) {
if (number <= 1) return false;
for (int i = 2; i <= Math.sqrt(number); i++) {
if (number % i == 0) return false;
}
return true;
}
public static boolean isNeonNumber(int number) {
int square = number * number;
int[] digits = NumberCheckerDigitsL3.getDigits(square);
return NumberCheckerHarshadL3.sumOfDigits(digits) == number;
}
public static boolean isSpyNumber(int number) {
int[] digits = NumberCheckerDigitsL3.getDigits(number);
int sum = NumberCheckerHarshadL3.sumOfDigits(digits);
int product = 1;
for (int digit : digits) {
product *= digit;
}
return sum == product;
}
public static boolean isAutomorphicNumber(int number) {
int square = number * number;
return String.valueOf(square).endsWith(String.valueOf(number));
}
public static boolean isBuzzNumber(int number) {
return number % 7 == 0 || number % 10 == 7;
}
public static void main(String[] args) {
int number = 7;
System.out.println("Is Prime: " + isPrime(number));
System.out.println("Is Neon Number: " + isNeonNumber(number));
System.out.println("Is Spy Number: " + isSpyNumber(number));
System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));
System.out.println("Is Buzz Number: " + isBuzzNumber(number));
}
}
