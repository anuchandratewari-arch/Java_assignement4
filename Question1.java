
interface Bank {
    void bankDetails();
}

class Customer {
    String name;
    int customerId;

    void getCustomer(String n, int id) {
        name = n;
        customerId = id;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account extends Customer implements Bank {
    int accountNumber;
    double balance;

    void getAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    public void bankDetails() {
        System.out.println("Bank: State Bank of India");
    }

    void displayAccount() {
        displayCustomer();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        bankDetails();
    }
}

public class Question1 {
    public static void main(String[] args) {
        Account a = new Account();

        a.getCustomer("Ranveer", 101);
        a.getAccount(1695, 90000);

        a.displayAccount();
    }
}