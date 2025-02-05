import java.util.Scanner;
public class CentimetreToFeetInch{
public static void main(String[]args){ 
Scanner sc = new Scanner(System.in);
System.out.println("Enter your height in centimetre");
float heightInCm= sc.nextFloat();
float heightInInch= heightInCm/(float)2.54;
float heightInFoot= heightInInch/(float)12;
System.out.println(" Your Height in cm is "+heightInCm+" while in feet is "+heightInFoot+" and inches is "+heightInInch);
}
}
