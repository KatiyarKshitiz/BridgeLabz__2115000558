import java.util.Random;

public class FootballTeam {
public static int[] generateHeights() {
Random random = new Random();
int[] heights = new int[11];
for (int i = 0; i < heights.length; i++) {
heights[i] = 150 + random.nextInt(101);
}
return heights;
}
public static int findSum(int[] heights) {
int sum = 0;
for (int height : heights) {
sum += height;
}
return sum;
}
public static double findMean(int[] heights) {
return (double) findSum(heights) / heights.length;
}
public static int findShortest(int[] heights) {
int shortest = heights[0];
for (int height : heights) {
if (height < shortest) shortest = height;
}
return shortest;
}
public static int findTallest(int[] heights) {
int tallest = heights[0];
for (int height : heights) {
if (height > tallest) tallest = height;
}
return tallest;
}
public static void main(String[] args) {
int[] heights = generateHeights();
int sum = findSum(heights);
double mean = findMean(heights);
int shortest = findShortest(heights);
int tallest = findTallest(heights);
System.out.print("Heights: ");
for (int height : heights) {
System.out.print(height + " ");
}
System.out.println("\nSum: " + sum);
System.out.println("Mean: " + mean);
System.out.println("Shortest: " + shortest);
System.out.println("Tallest: " + tallest);
}
}
