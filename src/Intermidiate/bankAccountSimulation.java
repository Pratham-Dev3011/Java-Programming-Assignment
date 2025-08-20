package Intermidiate;

public class bankAccountSimulation {

    private static int accountno = 5500;
    private String name;
    private double balance = 0.0;

    public void bankAccount(String name) {
        this.name = name;
    }

    public void createAccount(String name , double initialDeposit) {
        accountno++;
        this.name = name;
        this.balance = initialDeposit;
        System.out.println("Account created for " + name + " with account number: " + accountno);
    }
    public void deposit(int accountno,double amount) {
        System.out.println("Depositing " + amount + " to account number: " + accountno);

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void displayBalance() {
        System.out.println("Current balance for account number " + accountno + ": " + balance);
    }
    public static void main(String[] args) {
        bankAccountSimulation account = new bankAccountSimulation();
        account.createAccount("John Doe", 1000.0);
        account.displayBalance();

        account.deposit(accountno, 500.0);
        account.withdraw(200.0);
        account.displayBalance();

        account.withdraw(1500.0); // Attempt to withdraw more than balance
        account.displayBalance();
    }
    
}
