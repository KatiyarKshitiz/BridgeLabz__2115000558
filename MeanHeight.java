import java.util.Scanner;
public class MeanHeight {
public static void main(String[] args) {
double[] heights = new double[11];
double total = 0.0;
Scanner sc = new Scanner(System.in);
System.out.println("E	nter the Height: ");
for (int i = 0; i < heights.length; i++) {
heights[i] = sc.nextDouble();
total += heights[i];
}
System.out.println("Mean height: " + (total / heights.length));
}
}
