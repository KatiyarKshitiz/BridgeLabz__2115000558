import java.util.Scanner;
public class FriendsInfo {
public static int findYoungest(int[] ages) {
int minAge = ages[0];
for (int age : ages) if (age < minAge) minAge = age;
return minAge;
}
public static double findTallest(double[] heights) {
double maxHeight = heights[0];
for (double height : heights) if (height > maxHeight) maxHeight = height;
return maxHeight;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] ages = new int[3];
double[] heights = new double[3];
for (int i = 0; i < 3; i++) {
System.out.print("Enter age of friend " + (i + 1) + ": ");
ages[i] = sc.nextInt();
System.out.print("Enter height of friend " + (i + 1) + ": ");
heights[i] = sc.nextDouble();
}
System.out.println("Youngest age: " + findYoungest(ages));
System.out.println("Tallest height: " + findTallest(heights));
}
}
