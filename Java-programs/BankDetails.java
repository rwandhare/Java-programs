/*2. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.*/

// Account Interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
    void viewBalance();
}

// SavingsAccount Class
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Savings Account");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

// CurrentAccount Class
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Current Account");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account");
        } else {
            System.out.println("Overdraft limit exceeded in Current Account");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current account
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

// Bank Class
class Bank {
    private Account[] accounts;
    private int numberOfAccounts;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        numberOfAccounts = 0;
    }

    public void addAccount(Account account) {
        if (numberOfAccounts >= accounts.length) {
            resize();
        }
        accounts[numberOfAccounts++] = account;
        System.out.println("Account added to bank");
    }

    private void resize() {
        Account[] newAccounts = new Account[accounts.length * 2];
        System.arraycopy(accounts, 0, newAccounts, 0, accounts.length);
        accounts = newAccounts;
    }

    public void viewAllBalances() {
        for (int i = 0; i < numberOfAccounts; i++) {
            accounts[i].viewBalance();
        }
    }
}

// Main Class
public class BankDetails {
    public static void main(String[] args) {
        Bank bank = new Bank(2);

        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(2000, 500);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(500);
        currentAccount.withdraw(100);

        System.out.println("Interest on Savings Account: " + savingsAccount.calculateInterest());

        bank.viewAllBalances();
    }
}


/* Output

Account added to bank
Account added to bank
Deposited 500.0 to Savings Account
Withdrew 100.0 from Current Account
Interest on Savings Account: 75.0
Savings Account Balance: 1500.0
Current Account Balance: 1900.0
*/