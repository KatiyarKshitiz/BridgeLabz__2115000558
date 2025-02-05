import java.util.Scanner;
public class AthleteRounds{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side(in mtr): ");
        double first = sc.nextDouble();
        System.out.println("Enter the second side(in mtr): ");
        double second = sc.nextDouble();
        System.out.println("Enter the third side(in mtr): ");
        double third = sc.nextDouble();
        double perimeter = calculatePerimeter(first, second, third); 
        double distanceToRun=5000;
        int rounds = calculateRound(distanceToRun, perimeter);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        sc.close();
    }
    public static double calculatePerimeter(double first, double second, double third){
        return(first+second+third);
    }
    public static int calculateRound(double distance, double perimeter){
    int rounds = (int)(distance/perimeter);
    if(distance%perimeter!=0){
        rounds+=1;
    }
    return rounds;
    }
}
