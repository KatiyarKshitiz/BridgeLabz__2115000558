import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
class SubstringOccurrences {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
System.out.print("Enter a substring: ");
String sub = sc.nextLine();
int count = str.split(Pattern.quote(sub), -1).length - 1;
System.out.println("Occurrences: " + count);
}
}
