package Assignment3_Banking;

public class SavingsAccount extends Account {
    private final double minimumBalance;

    public SavingsAccount(String accountNumber, String holderName, double openingBalance, double minimumBalance) {
        super(accountNumber, holderName, openingBalance);
        this.minimumBalance = minimumBalance;
    }

    public SavingsAccount(String accountNumber, String holderName, double openingBalance) {
        this(accountNumber, holderName, openingBalance, 500.0);
    }

    @Override
    public void deposit(double amount) {
        requirePositive(amount);
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        requirePositive(amount);
        if (balance - amount < minimumBalance) {
            throw new IllegalArgumentException("Cannot go below minimum balance: " + minimumBalance);
        }
        balance -= amount;
    }
}

