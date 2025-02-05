public class NumberCheckerDigitsL3 {
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
public static boolean isDuckNumber(int number) {
String numStr = String.valueOf(number);
return numStr.contains("0") && numStr.charAt(0) != '0';
}
public static boolean isArmstrongNumber(int number) {
int[] digits = getDigits(number);
int sum = 0;
for (int digit : digits) {
sum += Math.pow(digit, digits.length);
}
return sum == number;
}
public static int[] findLargestAndSecondLargest(int[] digits) {
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for (int digit : digits) {
if (digit > largest) {
secondLargest = largest;
largest = digit;
} else if (digit > secondLargest && digit != largest) {
secondLargest = digit;
}
}
return new int[]{largest, secondLargest};
}
public static void main(String[] args) {
int number = 153;
System.out.println("Count of digits: " + countDigits(number));
int[] digits = getDigits(number);
System.out.print("Digits: ");
for (int digit : digits) {
System.out.print(digit + " ");
}
System.out.println("\nIs Duck Number: " + isDuckNumber(number));
System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));
int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
System.out.println("Largest: " + largestAndSecondLargest[0] + ", Second Largest: " + largestAndSecondLargest[1]);
}
}

