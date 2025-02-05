import java.util.Random;
public class EmployeeBonusL3 {
public static int[][] generateSalariesAndYears(int n) {
Random random = new Random();
int[][] data = new int[n][2];
for (int i = 0; i < n; i++) {
data[i][0] = 10000 + random.nextInt(90000);
data[i][1] = 1 + random.nextInt(10);
}
return data;
}
public static double[][] calculateNewSalaryAndBonus(int[][] data) {
double[][] result = new double[data.length][2];
for (int i = 0; i < data.length; i++) {
double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
result[i][0] = data[i][0] + (data[i][0] * bonusRate);
result[i][1] = data[i][0] * bonusRate;
}
return result;
}
public static void calculateAndDisplayTotals(int[][] data, double[][] newData) {
int oldSalarySum = 0;
double newSalarySum = 0;
double totalBonus = 0;
System.out.println("Employee\tOld Salary\tYears of Service\tBonus\tNew Salary");
for (int i = 0; i < data.length; i++) {
oldSalarySum += data[i][0];
newSalarySum += newData[i][0];
totalBonus += newData[i][1];
System.out.printf("%d\t\t%d\t\t%d\t\t%.2f\t%.2f\n", i + 1, data[i][0], data[i][1], newData[i][1], newData[i][0]);
}
System.out.println("Total\t\t" + oldSalarySum + "\t\t\t\t" + totalBonus + "\t" + newSalarySum);
}
public static void main(String[] args) {
int[][] employeeData = generateSalariesAndYears(10);
double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
calculateAndDisplayTotals(employeeData, updatedData);
}
}
