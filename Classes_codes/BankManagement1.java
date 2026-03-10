import java.io.*;
import java.util.*;

class BankAccount {
    String name;
    String password;
    double balance;
    ArrayList<String> transactionHistory = new ArrayList<>();
    String accountType;

    // Constructor for creating an account
    public BankAccount(String name, String password, double balance, String accountType) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountType = accountType;
        transactionHistory.add("Account created with initial balance: " + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount + " New Balance: " + balance);
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " New Balance: " + balance);
            return true;
        }
        return false;
    }

    // View transaction history
    public void viewTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History: ");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    // Calculate interest for saving account
    public void calculateInterest() {
        if (accountType.equals("Saving Account")) {
            double interest = balance * 0.04;  // Example interest rate: 4% annually
            deposit(interest); // Add interest to the balance
            transactionHistory.add("Interest added: " + interest + " New Balance: " + balance);
        }
    }
}

public class BankManagement1 {
    static Map<String, BankAccount> accounts = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Load accounts from a file (Data persistence)
        loadData();

        while (true) {
            System.out.println("\n1. Create an account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int option = sc.nextInt();
            sc.nextLine(); // consume the newline character after nextInt()

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    saveData(); // Save accounts data before exit
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }

    // Method to create a new account
    public static void createAccount() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter initial deposit: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // consume the newline character after nextDouble()

        System.out.println("Select account type: ");
        System.out.println("1. Basic Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Premium Account");
        System.out.print("Choose option (1-3): ");
        int typeOption = sc.nextInt();
        sc.nextLine(); // consume the newline character after nextInt()

        String accountType = "";
        switch (typeOption) {
            case 1:
                accountType = "Basic Account";
                break;
            case 2:
                accountType = "Saving Account";
                break;
            case 3:
                accountType = "Premium Account";
                break;
            default:
                System.out.println("Invalid option! Defaulting to Basic Account.");
                accountType = "Basic Account";
                break;
        }

        BankAccount newAccount = new BankAccount(name, password, balance, accountType);
        accounts.put(name, newAccount);
        System.out.println("Account created successfully for " + name);
    }

    // Method to login to an account
    public static void login() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (accounts.containsKey(name)) {
            BankAccount account = accounts.get(name);
            if (account.password.equals(password)) {
                System.out.println("Login successful! Welcome " + name);
                accountOperations(account);
            } else {
                System.out.println("Incorrect password!");
            }
        } else {
            System.out.println("Account not found! Please create an account.");
        }
    }

    // Method to perform operations once logged in
    public static void accountOperations(BankAccount account) {
        while (true) {
            System.out.println("\n1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. View Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Calculate Interest (for Saving Account)");
            System.out.println("6. Logout");
            System.out.print("Choose operation (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine(); // consume the newline character
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    sc.nextLine(); // consume the newline character
                    if (!account.withdraw(withdrawAmount)) {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.balance);
                    break;
                case 4:
                    account.viewTransactionHistory();
                    break;
                case 5:
                    account.calculateInterest();
                    break;
                case 6:
                    System.out.println("Logging out...");
                    return; // Exit to the main menu
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Method to save data to a file (data persistence)
    public static void saveData() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("accounts.dat"))) {
            out.writeObject(accounts);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Method to load data from a file (data persistence)
    @SuppressWarnings("unchecked")
    public static void loadData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("accounts.dat"))) {
            accounts = (Map<String, BankAccount>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous data found, starting fresh.");
        }
    }
}
