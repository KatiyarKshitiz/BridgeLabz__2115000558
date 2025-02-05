import java.util.Scanner;
public class SumTill0{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
double total = 0.0;
double input;
do {
System.out.print("Enter a number (0 to stop): ");
input = scanner.nextDouble();
total += input;
} while (input != 0);
System.out.println("The total sum is: " + total);
}
}

