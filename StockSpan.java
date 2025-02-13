import java.util.*;
public class StockSpan {
public static void calculateSpan(int[] prices, int n) {
System.out.println("Stock Prices: " + Arrays.toString(prices));
Stack<Integer> stack = new Stack<>();
int[] span = new int[n];
stack.push(0);
span[0] = 1;
for (int i = 1; i < n; i++) {
while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) stack.pop();
span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
stack.push(i);
}
System.out.println("Stock Span Output: " + Arrays.toString(span));
}
public static void main(String[] args) {
int[] prices = {100, 80, 60, 70, 60, 75, 85};
calculateSpan(prices, prices.length);
}
}
