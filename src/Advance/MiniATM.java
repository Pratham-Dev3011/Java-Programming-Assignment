package Advance;

import java.io.*;
import java.util.Scanner;

class Account {
    private double balance;
    private final String fileName = "balance.txt";

    
    public Account() {
        balance = loadBalance();
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            saveBalance();
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println(" Invalid deposit amount!");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            saveBalance();
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println(" Insufficient balance or invalid amount!");
        }
    }

    
    private void saveBalance() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(String.valueOf(balance));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private double loadBalance() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            return 0.0;
        }
    }
}


public class MiniATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        while (true) {
            System.out.println("\n====== MINI ATM ======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println("Thank you for using Mini ATM!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        }
    }
}

