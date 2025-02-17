import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
public static void main(String[] args) {
Random random = new Random();
int[] sizes = {1000, 10000, 1000000};
for (int size : sizes) {
int[] data = new int[size];
for (int i = 0; i < size; i++) data[i] = random.nextInt(size * 10);
int target = data[random.nextInt(size)];
long start, end;
start = System.nanoTime();
linearSearch(data, target);
end = System.nanoTime();
System.out.println("Linear Search (N=" + size + "): " + (end - start) / 1e6 + " ms");
Arrays.sort(data);
start = System.nanoTime();
binarySearch(data, target);
end = System.nanoTime();
System.out.println("Binary Search (N=" + size + "): " + (end - start) / 1e6 + " ms");
}
}
public static int linearSearch(int[] arr, int target) {
for (int i = 0; i < arr.length; i++) if (arr[i] == target) return i;
return -1;
}
public static int binarySearch(int[] arr, int target) {
int left = 0, right = arr.length - 1;
while (left <= right) {
int mid = left + (right - left) / 2;
if (arr[mid] == target) return mid;
if (arr[mid] < target) left = mid + 1;
else right = mid - 1;
}
return -1;
}
}
