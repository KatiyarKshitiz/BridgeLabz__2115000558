import java.util.Scanner;
public class EmployeeBonus {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the employee's salary: ");
double salary = scanner.nextDouble();
System.out.print("Enter the years of service: ");
int yearsOfService = scanner.nextInt();
if (yearsOfService > 5) {
double bonus = 0.05 * salary;
System.out.println("Bonus amount: " + bonus);
} else {
System.out.println("No bonus for less than 6 years of service.");
}
scanner.close();
}
}
