import java.util.Scanner;
public class MaxHandShakesMethod{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int number = sc.nextInt();
        int maxhandshakes= handshakeMax(number);
        System.out.println("The maximum number of handshakes in "+number+" students is: "+maxhandshakes);
    }
    public static int handshakeMax(int number){
        return (number*(number-1)) / 2;
    }
}
