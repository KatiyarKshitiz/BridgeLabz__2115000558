import java.util.*;
class LongestConsecutiveSequence {
public static int findLongestSequence(int[] arr) {
Set<Integer> set = new HashSet<>();
for (int num : arr) set.add(num);
int longest = 0;
System.out.println("Input Array: " + Arrays.toString(arr));
for (int num : arr) {
if (!set.contains(num - 1)) {
int currentNum = num, count = 1;
while (set.contains(currentNum + 1)) {
currentNum++;
count++;
}
longest = Math.max(longest, count);
}
}
System.out.println("Longest Consecutive Sequence Length: " + longest);
return longest;
}
}
public class LongestSequenceFinder {
public static void main(String[] args) {
int[] arr = {100, 4, 200, 1, 3, 2};
LongestConsecutiveSequence.findLongestSequence(arr);
}
}
