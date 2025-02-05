import java.util.*;
import java.util.stream.Collectors;
class RemoveSpecificCharacter {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
System.out.print("Enter character to remove: ");
char ch = sc.next().charAt(0);
System.out.println("Modified string: " + str.replace(String.valueOf(ch), ""));
}
}
