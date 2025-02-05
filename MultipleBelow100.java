import java.util.Scanner;
public class MultipleBelow100{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int number = sc.nextInt();
for(int i=100;i>=1;i--){
if(number%i==0){
System.out.println("Number "+i+" divides the given number properly");
}
}
sc.close();
}
}

