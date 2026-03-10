
class Account {

    private double balance;

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Adding money to balance
        } else {
            System.out.println("Amount should be positive.");
        }
        Main obje = new Main();
        System.out.println(obje.age);
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

}

public class Main {

    int age = 20;

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);  // Using business method to deposit money
        System.out.println("Balance: " + account.getBalance());  // Using getter to get balance
    }
}
