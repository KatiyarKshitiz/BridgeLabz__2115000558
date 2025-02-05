import java.util.Scanner;
import java.time.*;
class DateArithmetic {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter date (yyyy-MM-dd):");
LocalDate date = LocalDate.parse(sc.next());
date = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
System.out.println("Updated date: " + date);
}
}
