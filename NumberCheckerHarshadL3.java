public class NumberCheckerHarshadL3 {
public static int countDigits(int number) {
return String.valueOf(number).length();
}
public static int[] getDigits(int number) {
String numStr = String.valueOf(number);
int[] digits = new int[numStr.length()];
for (int i = 0; i < numStr.length(); i++) {
digits[i] = Character.getNumericValue(numStr.charAt(i));
}
return digits;
}
public static int sumOfDigits(int[] digits) {
int sum = 0;
for (int digit : digits) {
sum += digit;
}
return sum;
}
public static int sumOfSquares(int[] digits) {
int sum = 0;
for (int digit : digits) {
sum += Math.pow(digit, 2);
}
return sum;
}
public static boolean isHarshadNumber(int number) {
int[] digits = getDigits(number);
int sum = sumOfDigits(digits);
return number % sum == 0;
}
public static int[][] findDigitFrequency(int number) {
int[] digits = getDigits(number);
int[][] frequency = new int[10][2];
for (int i = 0; i < 10; i++) {
frequency[i][0] = i;
}
for (int digit : digits) {
frequency[digit][1]++;
}
return frequency;
}
public static void main(String[] args) {
int number = 21;
System.out.println("Is Harshad Number: " + isHarshadNumber(number));
System.out.println("Sum of Squares: " + sumOfSquares(getDigits(number)));
int[][] frequency = findDigitFrequency(number);
System.out.println("Digit Frequency:");
for (int[] row : frequency) {
System.out.println(row[0] + " -> " + row[1]);
}
}
}
