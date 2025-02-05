import java.util.Scanner;
public class FriendsAgeHeight {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] age = new int[3];
double[] height = new double[3];
System.out.println("Enter age and height of Amar:");
age[0] = sc.nextInt();
height[0] = sc.nextDouble();
System.out.println("Enter age and height of Akbar:");
age[1] = sc.nextInt();
height[1] = sc.nextDouble();
System.out.println("Enter age and height of Anthony:");
age[2] = sc.nextInt();
height[2] = sc.nextDouble();
int youngest = 0;
for (int i = 1; i < 3; i++) {
if (age[i] < age[youngest]) {
youngest = i;
}
}
int tallest = 0;
for (int i = 1; i < 3; i++) {
if (height[i] > height[tallest]) {
tallest = i;
}
}
System.out.println("Youngest friend is: " + (youngest == 0 ? "Amar" : youngest == 1 ? "Akbar" : "Anthony"));
System.out.println("Tallest friend is: " + (tallest == 0 ? "Amar" : tallest == 1 ? "Akbar" : "Anthony"));
}
}
