package Assignment3_Banking;

public class CheckingAccount extends Account {
    private final double overdraftLimit;

    public CheckingAccount(String accountNumber, String holderName, double openingBalance, double overdraftLimit) {
        super(accountNumber, holderName, openingBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(String accountNumber, String holderName, double openingBalance) {
        this(accountNumber, holderName, openingBalance, 1000.0);
    }

    @Override
    public void deposit(double amount) {
        requirePositive(amount);
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        requirePositive(amount);
        if (balance - amount < -overdraftLimit) {
            throw new IllegalArgumentException("Exceeds overdraft limit: " + overdraftLimit);
        }
        balance -= amount;
    }
}

