package abstraction;

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(1500.00);
    }
}
