import java.util.*;
import java.util.stream.Collectors;
class AnagramCheck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first string: ");
char[] a = sc.nextLine().toCharArray();
System.out.print("Enter second string: ");
char[] b = sc.nextLine().toCharArray();
Arrays.sort(a);
Arrays.sort(b);
System.out.println(Arrays.equals(a, b) ? "Anagrams" : "Not Anagrams");
}
}
