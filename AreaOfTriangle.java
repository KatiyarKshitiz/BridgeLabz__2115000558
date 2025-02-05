import java.util.Scanner;
public class AreaOfTriangle{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Base of Triangle in cm: ");
float basecm = sc.nextFloat();
float basein = basecm/(float)2.54;
System.out.println("Height of Triangle in cm: ");
float heightcm = sc.nextFloat();
float heightin = heightcm/(float)2.54;
float areacm=(basecm*heightcm)/(float)2;
float areain=(basein*heightin)/(float)2;
System.out.println("The area of triangle with base "+basecm+"cm and height "+heightcm+"cm is "+areacm+" sqaure cm and in inches is "+areain+" sqaure inches .");
}
}
