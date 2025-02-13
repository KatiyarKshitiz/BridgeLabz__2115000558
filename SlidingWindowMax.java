import java.util.*;
public class SlidingWindowMax {
public static void findMax(int[] arr, int k) {
System.out.println("Input Array: " + Arrays.toString(arr));
System.out.println("Window Size: " + k);
Deque<Integer> deque = new LinkedList<>();
System.out.print("Sliding Window Maximum Output: ");
for (int i = 0; i < arr.length; i++) {
while (!deque.isEmpty() && deque.peek() < i - k + 1) deque.poll();
while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) deque.pollLast();
deque.offer(i);
if (i >= k - 1) System.out.print(arr[deque.peek()] + " ");
}
System.out.println();
}
public static void main(String[] args) {
int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
int k = 3;
findMax(arr, k);
}
}
