import java.util.Scanner;
public class MatrixTo1DArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows:");
int rows = sc.nextInt();
System.out.println("Enter the number of columns:");
int cols = sc.nextInt();
int[][] matrix = new int[rows][cols];
System.out.println("Enter the elements of the 2D array:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix[i][j] = sc.nextInt();
}
}
int[] oneDArray = new int[rows * cols];
int index = 0;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
oneDArray[index] = matrix[i][j];
index++;
}
}
System.out.println("Elements of the 1D array:");
for (int i = 0; i < oneDArray.length; i++) {
System.out.print(oneDArray[i] + " ");
}
}
}
