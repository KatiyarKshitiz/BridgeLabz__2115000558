import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
public static void main(String[] args) {
Random random = new Random();
int[] sizes = {1000, 10000, 1000000};
for (int size : sizes) {
int[] data = new int[size];
for (int i = 0; i < size; i++) data[i] = random.nextInt(size * 10);
int[] bubbleData = Arrays.copyOf(data, data.length);
int[] mergeData = Arrays.copyOf(data, data.length);
int[] quickData = Arrays.copyOf(data, data.length);
long start, end;
start = System.nanoTime();
bubbleSort(bubbleData);
end = System.nanoTime();
System.out.println("Bubble Sort (N=" + size + "): " + (end - start) / 1e6 + " ms");
start = System.nanoTime();
mergeSort(mergeData);
end = System.nanoTime();
System.out.println("Merge Sort (N=" + size + "): " + (end - start) / 1e6 + " ms");
start = System.nanoTime();
quickSort(quickData, 0, quickData.length - 1);
end = System.nanoTime();
System.out.println("Quick Sort (N=" + size + "): " + (end - start) / 1e6 + " ms");
}
}
public static void bubbleSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++)
for (int j = 0; j < n - i - 1; j++)
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
public static void mergeSort(int[] arr) {
if (arr.length < 2) return;
int mid = arr.length / 2;
int[] left = Arrays.copyOfRange(arr, 0, mid);
int[] right = Arrays.copyOfRange(arr, mid, arr.length);
mergeSort(left);
mergeSort(right);
merge(arr, left, right);
}
private static void merge(int[] arr, int[] left, int[] right) {
int i = 0, j = 0, k = 0;
while (i < left.length && j < right.length)
arr[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
while (i < left.length) arr[k++] = left[i++];
while (j < right.length) arr[k++] = right[j++];
}
public static void quickSort(int[] arr, int low, int high) {
if (low < high) {
int pi = partition(arr, low, high);
quickSort(arr, low, pi - 1);
quickSort(arr, pi + 1, high);
}
}
private static int partition(int[] arr, int low, int high) {
int pivot = arr[high];
int i = low - 1;
for (int j = low; j < high; j++) {
if (arr[j] < pivot) {
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
int temp = arr[i + 1];
arr[i + 1] = arr[high];
arr[high] = temp;
return i + 1;
}
}

