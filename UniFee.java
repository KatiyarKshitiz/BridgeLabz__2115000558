import java.util.Scanner;
public class UniFee{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your fees");
int fee=sc.nextInt();
System.out.println("Enter the discount percent");
int discountPercent=sc.nextInt();
int discountvalue=(discountPercent/100)*fee;
int discount=(fee*discountPercent)/100;
int discounted_fee=fee-discount;
System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discounted_fee);
}
}

