import java.util.Scanner;
public class NaturalChecker{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number: ");
int number = sc.nextInt();
if(number>0){
int sum=number*(number+1)/2;
System.out.println("The sum of " + number + " natural numbers is " + sum);
}else{
System.out.println("The number " + number + " is not a natural number");
}
sc.close();
}
}
