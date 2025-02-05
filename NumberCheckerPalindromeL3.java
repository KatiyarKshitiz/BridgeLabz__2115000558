public class NumberCheckerPalindromeL3 {
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
public static int[] reverseArray(int[] digits) {
int[] reversed = new int[digits.length];
for (int i = 0; i < digits.length; i++) {
reversed[i] = digits[digits.length - 1 - i];
}
return reversed;
}
public static boolean isPalindrome(int number) {
int[] digits = getDigits(number);
int[] reversed = reverseArray(digits);
for (int i = 0; i < digits.length; i++) {
if (digits[i] != reversed[i]) return false;
}
return true;
}
public static boolean isDuckNumber(int number) {
String numStr = String.valueOf(number);
return numStr.contains("0") && numStr.charAt(0) != '0';
}
public static void main(String[] args) {
int number = 121;
System.out.println("Is Palindrome: " + isPalindrome(number));
System.out.println("Is Duck Number: " + isDuckNumber(number));
}
}
