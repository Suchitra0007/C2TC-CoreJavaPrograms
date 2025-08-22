package Assignment3_Banking;

public final class Bank {
    private static int totalAccounts = 0;

    private Bank() { } // utility class

    public static synchronized void registerAccount() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
