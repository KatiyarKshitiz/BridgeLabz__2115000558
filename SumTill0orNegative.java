import java.util.Scanner;
public class SumTill0orNegative{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
double input;
double total = 0.0;
while (true) {
System.out.print("Enter a number (0 or negative to stop): ");
input = scanner.nextDouble();
if (input <= 0) {
break;
}
total += input;
}
System.out.println("The total sum is: " + total);
 scanner.close();
}
}
