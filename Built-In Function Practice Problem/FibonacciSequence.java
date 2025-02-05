import java.util.*;
class FibonacciSequence {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of terms:");
int n = sc.nextInt(), a = 0, b = 1, temp;
for (int i = 0; i < n; i++) {
System.out.print(a + " ");
temp = a + b;
a = b;
b = temp;
}
}
}

