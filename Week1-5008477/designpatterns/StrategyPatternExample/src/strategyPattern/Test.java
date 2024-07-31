package strategyPattern;

public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("John Doe", "1234567890123456", "123", "12/24");
        context.setPaymentStrategy(creditCard);
        context.pay(100.00);

        // Pay using PayPal
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com", "password");
        context.setPaymentStrategy(payPal);
        context.pay(200.00);
    }
}
