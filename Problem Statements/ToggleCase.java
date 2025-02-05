import java.util.Scanner;
class ToggleCase {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
String result = "";
for (char c : str.toCharArray()) result += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
System.out.println("Toggled case string: " + result);
}
}

