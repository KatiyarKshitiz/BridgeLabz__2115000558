import java.util.*;
class PairWithGivenSum {
public static boolean hasPairWithSum(int[] arr, int target) {
Set<Integer> set = new HashSet<>();
System.out.println("Input Array: " + Arrays.toString(arr));
System.out.println("Target Sum: " + target);
for (int num : arr) {
if (set.contains(target - num)) {
System.out.println("Pair Found: (" + num + ", " + (target - num) + ")");
return true;
}
set.add(num);
}
System.out.println("No Pair Found");
return false;
}
}
public class PairSumCheck {
public static void main(String[] args) {
int[] arr = {10, 15, 3, 7};
int target = 17;
PairWithGivenSum.hasPairWithSum(arr, target);
}
}
