import java.util.*;
class Customer {
String name;
List<Account> accounts = new ArrayList<>();
Customer(String name) {
this.name = name;
}
void addAccount(Account account) {
accounts.add(account);
}
void viewBalance() {
for (Account account : accounts) {
System.out.println("Account Balance: " + account.getBalance());
}
}
}
class Account {
double balance;
Account(double balance) {
this.balance = balance;
}
double getBalance() {
return balance;
}
}
class Bank {
List<Customer> customers = new ArrayList<>();
void openAccount(Customer customer, Account account) {
customer.addAccount(account);
if (!customers.contains(customer)) {
customers.add(customer);
}
}
}
public class BankMain {
public static void main(String[] args) {
Customer customer = new Customer("John Doe");
Account account1 = new Account(1000);
Account account2 = new Account(2000);
Bank bank = new Bank();
bank.openAccount(customer, account1);
bank.openAccount(customer, account2);
customer.viewBalance();
}
}
