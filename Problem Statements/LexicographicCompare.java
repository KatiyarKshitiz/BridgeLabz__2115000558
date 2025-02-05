import java.util.*;
import java.util.stream.Collectors;
class LexicographicCompare {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first string: ");
String s1 = sc.nextLine();
System.out.print("Enter second string: ");
String s2 = sc.nextLine();
System.out.println(s1.equals(s2) ? "Equal" : s1.compareTo(s2) < 0 ? s1 + " comes before " + s2 : s2 + " comes before " + s1);
}
}
