package Assignment3_Banking;

public class Transaction {
    private final double transactionFee; // final variable = fixed fee for each transaction

    public Transaction() { this(5.0); } // default fee
    public Transaction(double fee) {
        if (fee < 0) throw new IllegalArgumentException("Fee cannot be negative.");
        this.transactionFee = fee;
    }

    // final method keeps the process consistent across all instances/subclasses
    public final void performTransaction(Account from, Account to, double amount) {
        if (from == null || to == null) throw new IllegalArgumentException("Accounts must not be null.");
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0.");
        from.withdraw(amount + transactionFee); // fee charged to sender
        to.deposit(amount);
    }

    public double getTransactionFee() { return transactionFee; }
}
