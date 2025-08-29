package Assignment6;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a BankAccount object
            BankAccount account = new BankAccount(101, 5000);

            // Display initial balance
            account.displayBalance();

            // Deposit money
            account.deposit(2000);

            // Withdraw money
            account.withdraw(3000);

            // Trying invalid deposit
            account.deposit(-500);

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }
    }
}
