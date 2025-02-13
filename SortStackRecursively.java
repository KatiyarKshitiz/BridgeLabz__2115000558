import java.util.*;
class StackSorter {
Stack<Integer> stack = new Stack<>();
void insertSorted(int x) {
if (stack.isEmpty() || x > stack.peek()) {
stack.push(x);
return;
}
int temp = stack.pop();
insertSorted(x);
stack.push(temp);
}
void sortStack() {
if (!stack.isEmpty()) {
int temp = stack.pop();
sortStack();
insertSorted(temp);
}
}
}
public class SortStackRecursively {
public static void main(String[] args) {
StackSorter s = new StackSorter();
s.stack.push(3);
s.stack.push(1);
s.stack.push(4);
s.stack.push(2);
System.out.println("Input Stack: [3, 1, 4, 2]");
s.sortStack();
System.out.println("Sorted Stack Output:");
while (!s.stack.isEmpty()) System.out.println(s.stack.pop());
}
}
