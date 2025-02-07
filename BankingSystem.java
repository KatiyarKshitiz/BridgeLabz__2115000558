class BankAccount {
int accountNumber;
double balance;
BankAccount(int accountNumber, double balance) {
this.accountNumber = accountNumber;
this.balance = balance;
}
void displayAccountType() {
System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
}
}
class SavingsAccount extends BankAccount {
double interestRate;
SavingsAccount(int accountNumber, double balance, double interestRate) {
super(accountNumber, balance);
this.interestRate = interestRate;
}
void displayAccountType() {
super.displayAccountType();
System.out.println("Account Type: Savings, Interest Rate: " + interestRate + "%");
}
}
class CheckingAccount extends BankAccount {
double withdrawalLimit;
CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
super(accountNumber, balance);
this.withdrawalLimit = withdrawalLimit;
}
void displayAccountType() {
super.displayAccountType();
System.out.println("Account Type: Checking, Withdrawal Limit: " + withdrawalLimit);
}
}
class FixedDepositAccount extends BankAccount {
int maturityPeriod;
FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
super(accountNumber, balance);
this.maturityPeriod = maturityPeriod;
}
void displayAccountType() {
super.displayAccountType();
System.out.println("Account Type: Fixed Deposit, Maturity Period: " + maturityPeriod + " years");
}
}
public class BankingSystem {
public static void main(String[] args) {
SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
CheckingAccount checking = new CheckingAccount(102, 10000, 2000);
FixedDepositAccount fixed = new FixedDepositAccount(103, 50000, 5);
savings.displayAccountType();
checking.displayAccountType();
fixed.displayAccountType();
}
}
