package wrong;

public class Application {
    public static void main(String[] args) {
        PaymentProcessor cryptoProcessor = new CryptoProcessor();
        cryptoProcessor.payWithCreditCard();
    }
}
