import java.util.Scanner;

public class ExceptionPropagation {
    public static void calculateInterest(double amount, double rate, int years) {
        System.out.println("Calculating interest...");
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        System.out.println("Interest: " + (amount * rate * years / 100));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double amount = scanner.nextDouble();

        System.out.println("Enter interest rate:");
        double rate = scanner.nextDouble();

        System.out.println("Enter number of years:");
        int years = scanner.nextInt();
        
        scanner.close();  // Close the scanner

        try {
            calculateInterest(amount, rate, years);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

