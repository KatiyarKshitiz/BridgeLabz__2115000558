import java.util.Scanner;
public class NaturalNumbersSumL2 {
public static int sumUsingRecursion(int n) {
if (n == 1) return 1;
return n + sumUsingRecursion(n - 1);
}
public static int sumUsingFormula(int n) {
return n * (n + 1) / 2;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a natural number: ");
int n = sc.nextInt();
if (n <= 0) {
System.out.println("Not a natural number.");
return;
}
int sumRec = sumUsingRecursion(n);
int sumFormula = sumUsingFormula(n);
System.out.println("Sum using recursion: " + sumRec);
System.out.println("Sum using formula: " + sumFormula);
System.out.println("Results match: " + (sumRec == sumFormula));
}
}
