import java.util.*;
import java.util.Random;
class NumberGuessingGame {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rand = new Random();
int low = 1, high = 100, guess;
String response;
do {
guess = rand.nextInt(high - low + 1) + low;
System.out.println("Is your number " + guess + "? (high/low/correct)");
response = sc.next();
if (response.equals("high")) high = guess - 1;
else if (response.equals("low")) low = guess + 1;
} while (!response.equals("correct"));
System.out.println("The computer guessed your number!");
}
}
