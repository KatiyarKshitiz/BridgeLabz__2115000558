import java.util.*;
class TwoSumFinder {
public static int[] findTwoSum(int[] arr, int target) {
Map<Integer, Integer> map = new HashMap<>();
System.out.println("Input Array: " + Arrays.toString(arr));
System.out.println("Target Sum: " + target);
for (int i = 0; i < arr.length; i++) {
int complement = target - arr[i];
if (map.containsKey(complement)) {
System.out.println("Pair Found at Indices: " + map.get(complement) + ", " + i);
return new int[]{map.get(complement), i};
}
map.put(arr[i], i);
}
System.out.println("No Pair Found");
return new int[]{-1, -1};
}
}
public class TwoSumProblem {
public static void main(String[] args) {
int[] arr = {2, 7, 11, 15};
int target = 9;
TwoSumFinder.findTwoSum(arr, target);
}
}
