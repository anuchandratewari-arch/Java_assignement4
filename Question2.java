
abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    abstract void withdrawl(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(double bal, int acc, String name,
                   String addr, double rate) {
        balance = bal;
        accountNumber = acc;
        accountHoldersName = name;
        address = addr;
        rateOfInterest = rate;
    }

    void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful");
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        double total = balance + interest;

        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + total);
    }
}

public class Question2 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(
            10000, 12345, "Lana", "Kolkata", 5
        );

        s.display();
        s.deposit(2000);
        s.withdrawl(1000);
        s.calculateAmount();
        s.display();
    }
}
