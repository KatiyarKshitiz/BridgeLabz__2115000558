import java.util.Scanner;
public class SimpleIntresetCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time period: ");
        double time = sc.nextDouble();
        double simpleInterest = calculateSI(principal,rate, time);
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        sc.close();
    }
    public static double calculateSI(double principal, double rate, double time){
    return (principal*rate*time) / 100;
    }
}
