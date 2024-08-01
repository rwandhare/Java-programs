/*2.Write a Java program to simulate a simple banking application.

● Create a class BankAccount with a balance and methods for deposit and

withdrawal.

● Implement exception handling for withdrawal operations to prevent overdrawing.

● Handle the scenario when the withdrawal amount is greater than the balance.
*/

import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Your balance is " + balance);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        try {
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            System.out.println("Deposit successful. New balance: " + account.getBalance());

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

/*
OUTPUT
1)
Enter initial balance: 80000
Enter deposit amount: 100000
Deposit successful. New balance: 180000.0
Enter withdrawal amount: 50000
Withdrawal successful. New balance: 130000.0
Final balance: 130000.0

2)
Enter initial balance: 900000
Enter deposit amount: 5000000
Deposit successful. New balance: 5900000.0
Enter withdrawal amount: 1000000
Withdrawal successful. New balance: 4900000.0
Final balance: 4900000.0

*/
