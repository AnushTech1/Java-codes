import java.util.Scanner;

class BankAccount {
   final private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Outer method to handle the account summary
    void displayAccountSummary() {
        // Nested method to calculate interest
        double interest = calculateInterest();
        
        // Nested method to display account information with interest
        displayAccountInfo(interest);
    }

    // Nested method: Calculate interest
    private double calculateInterest() {
        // Assume a simple interest rate of 5%
        double interestRate = 0.05;
        return balance * interestRate;
    }

    // Nested method: Display account info with interest
    private void displayAccountInfo(double interest) {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println("Calculated Interest: $" + interest);
    }

    // Method to perform a transaction
    void performTransaction(double amount, String transactionType) {
        // Nested method for deposit
        if (transactionType.equalsIgnoreCase("deposit")) {
            deposit(amount);
        }
        // Nested method for withdrawal
        else if (transactionType.equalsIgnoreCase("withdraw")) {
            withdraw(amount);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }

    // Nested method: Deposit money into the account
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Nested method: Withdraw money from the account
    private void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class NestedMethodBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for account holder and initial balance
        System.out.print("Enter Account Holder's Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Balance: $");
        double initialBalance = scanner.nextDouble();

        // Create a new bank account with user input
        BankAccount account = new BankAccount(name, initialBalance);

        while (true) {
            System.out.println("\n---- Banking Menu ----");
            System.out.println("1. Display Account Summary");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display account summary
                    account.displayAccountSummary();
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.performTransaction(depositAmount, "deposit");
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.performTransaction(withdrawAmount, "withdraw");
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the banking system!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
