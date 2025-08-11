import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private final String accountHolder;
    private double balance;
    private final ArrayList<String> transactionHistory;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount);
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            System.out.println("$" + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

public class BankAccountSimulation {
    private static final Scanner sc = new Scanner(System.in);
    private static Account account;

    public static void main(String[] args) {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial deposit amount: $");
        double initialBalance = sc.nextDouble();

        account = new Account(name, initialBalance);

        int choice;
        do {
            System.out.println("\n==== Bank Menu ====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> System.out.println("Current balance: $" + account.getBalance());
                case 4 -> account.printTransactionHistory();
                case 5 -> System.out.println("Thank you for banking with us!");
                default -> System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    private static void deposit() {
        System.out.print("Enter deposit amount: $");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
    }

    private static void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
