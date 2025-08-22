package Assignment3_Banking;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("SA1001", "Anita", 2000);
        CheckingAccount c1 = new CheckingAccount("CA2001", "Bala", 500);

        System.out.println("Total accounts after opening: " + Bank.getTotalAccounts());

        Transaction t = new Transaction(10.0); // fixed fee = 10
        t.performTransaction(s1, c1, 300);

        System.out.println("After transfer 300 with fee 10");
        System.out.println("Anita (Savings) balance: " + s1.getBalance());
        System.out.println("Bala  (Checking) balance: " + c1.getBalance());
        System.out.println("Total accounts (static): " + Bank.getTotalAccounts());
    }
}
