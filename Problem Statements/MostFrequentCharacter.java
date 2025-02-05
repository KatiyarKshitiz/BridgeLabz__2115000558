import java.util.*;
import java.util.stream.Collectors;
class MostFrequentCharacter {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
Map<Character, Integer> freq = new HashMap<>();
for (char c : str.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
char maxChar = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
System.out.println("Most frequent character: " + maxChar);
}
}
