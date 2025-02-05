import java.util.Random;

public class RandomNumbers {
public int[] generate4DigitRandomArray(int size) {
Random random = new Random();
int[] numbers = new int[size];
for (int i = 0; i < size; i++) {
numbers[i] = 1000 + random.nextInt(9000);
}
return numbers;
}
public double[] findAverageMinMax(int[] numbers) {
double sum = 0;
int min = numbers[0];
int max = numbers[0];
for (int number : numbers) {
sum += number;
if (number < min) min = number;
if (number > max) max = number;
}
double average = sum / numbers.length;
return new double[]{average, min, max};
}
public static void main(String[] args) {
RandomNumbers randomNumbers = new RandomNumbers();
int[] numbers = randomNumbers.generate4DigitRandomArray(5);
double[] result = randomNumbers.findAverageMinMax(numbers);
System.out.print("Random Numbers: ");
for (int number : numbers) {
System.out.print(number + " ");
}
System.out.println();
System.out.println("Average: " + result[0]);
System.out.println("Min: " + result[1]);
System.out.println("Max: " + result[2]);
}
}
