import java.util.*;
class MaximumOfThree {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers:");
int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
System.out.println("Maximum: " + Math.max(a, Math.max(b, c)));
}
}

