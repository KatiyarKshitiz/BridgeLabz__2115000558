import java.util.*;
class BasicCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers:");
double a = sc.nextDouble(), b = sc.nextDouble();
System.out.println("Enter operation (+ - * /):");
char op = sc.next().charAt(0);
System.out.println("Result: " + (op == '+' ? a + b : op == '-' ? a - b : op == '*' ? a * b : a / b));
}
}
