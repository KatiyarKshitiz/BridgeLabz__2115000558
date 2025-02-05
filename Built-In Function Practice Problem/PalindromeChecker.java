import java.util.*;
class PalindromeChecker {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String str = sc.nextLine(), rev = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
}
}

