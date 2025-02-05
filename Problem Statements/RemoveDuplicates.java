import java.util.*;
import java.util.stream.Collectors;
class RemoveDuplicates {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
String result = str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
System.out.println("String after removing duplicates: " + result);
}
}
