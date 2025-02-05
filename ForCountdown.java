import java.util.Scanner;
public class ForCountdown{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the countdown start value: ");
int counter = scanner.nextInt();
for (int i = counter; i > 0; i--) {
System.out.println(i);
}
System.out.println("Liftoff!");
scanner.close();
}
}
