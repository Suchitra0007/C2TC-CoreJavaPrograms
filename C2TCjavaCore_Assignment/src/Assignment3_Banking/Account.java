package Assignment3_Banking;

public abstract class Account {
    private final String accountNumber;
    private final String holderName;
    protected double balance;

    protected Account(String accountNumber, String holderName, double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Opening balance cannot be negative.");
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = openingBalance;
        Bank.registerAccount(); // update static count
    }

    protected final void requirePositive(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0.");
    }

    public final double getBalance() { // consistent across subclasses
        return balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return accountNumber + " - " + holderName + " : " + balance;
    }
}
