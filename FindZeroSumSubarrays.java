import java.util.*;
class ZeroSumSubarrays {
public static void findZeroSumSubarrays(int[] arr) {
Map<Integer, List<Integer>> map = new HashMap<>();
int sum = 0;
System.out.println("Input Array: " + Arrays.toString(arr));
System.out.println("Zero-Sum Subarrays:");
for (int i = 0; i < arr.length; i++) {
sum += arr[i];
if (sum == 0) System.out.println("Subarray (0 to " + i + ")");
if (map.containsKey(sum)) {
for (int start : map.get(sum)) System.out.println("Subarray (" + (start + 1) + " to " + i + ")");
}
map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
}
}
}
public class FindZeroSumSubarrays {
public static void main(String[] args) {
int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
ZeroSumSubarrays.findZeroSumSubarrays(arr);
}
}
