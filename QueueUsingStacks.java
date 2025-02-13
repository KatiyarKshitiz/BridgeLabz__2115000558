import java.util.*;
class StackQueue {
Stack<Integer> stack1 = new Stack<>();
Stack<Integer> stack2 = new Stack<>();
void enqueue(int x) {
stack1.push(x);
}
int dequeue() {
if (stack2.isEmpty()) {
while (!stack1.isEmpty()) stack2.push(stack1.pop());
}
return stack2.isEmpty() ? -1 : stack2.pop();
}
}
public class QueueUsingStacks {
public static void main(String[] args) {
StackQueue q = new StackQueue();
System.out.println("Enqueuing elements: 1, 2, 3");
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
System.out.println("Dequeuing elements:");
System.out.println("Output: " + q.dequeue());
System.out.println("Output: " + q.dequeue());
System.out.println("Output: " + q.dequeue());
}
}
