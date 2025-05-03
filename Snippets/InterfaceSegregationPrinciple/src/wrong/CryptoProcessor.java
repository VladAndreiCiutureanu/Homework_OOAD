package wrong;

public class CryptoProcessor implements PaymentProcessor {

    @Override
    public void payWithCrypto() {
        System.out.println("Paying with crypto");
    }

    @Override
    public void payWithCreditCard() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void payWithPaypal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
