import java.util.Scanner;
public class PowerNumber{
public static void main(String[]args){
int number, power;
int result=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
number = sc.nextInt();
System.out.println("Enter the power: ");
power = sc.nextInt();
if(power==0){
result=1;
}
for(int i=1;i<=power;i++){
result=result*number;
}
System.out.println("The value is " + result);
sc.close();
}
}
