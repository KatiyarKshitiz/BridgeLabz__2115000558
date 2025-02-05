class BankAccount {
private static String bankName = "Global Trust Bank";
private static int totalAccounts = 0;
private final String accountNumber;
private String accountHolderName;
private double balance;

public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = initialBalance;
totalAccounts++;
}

public static int getTotalAccounts() {
return totalAccounts;
}

public void displayAccountDetails() {
if (this instanceof BankAccount) {
System.out.println("Bank Name: " + bankName);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Account Number: " + accountNumber);
System.out.println("Balance: " + balance);
} else {
System.out.println("Invalid object type.");
}
}

public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposited: " + amount);
} else {
System.out.println("Invalid deposit amount.");
}
}

public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
System.out.println("Withdrawn: " + amount);
} else {
System.out.println("Invalid or insufficient funds.");
}
}

public static void main(String[] args) {
BankAccount account1 = new BankAccount("12345", "Kshitiz", 5000.0);
BankAccount account2 = new BankAccount("67890", "Prachi", 10000.0);
account1.displayAccountDetails();
System.out.println();
account2.displayAccountDetails();
account1.deposit(2000);
account1.withdraw(1500);
System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());
}
}
