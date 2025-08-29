package customexception;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.deposit(500);
            account.deposit(-200);   // ❌ will throw exception
        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account.withdraw(2000);  // ❌ will throw exception
        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
