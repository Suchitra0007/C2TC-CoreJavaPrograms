package customexception;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // deposit method that may throw custom exception
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // withdraw method that may throw custom exception
    public void withdraw(double amount) throws InvalidAmountException {
        if (amount > balance) {
            throw new InvalidAmountException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}
