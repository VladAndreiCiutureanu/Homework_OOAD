package wrong;

public class OrderService {
    private EmailNotifier emailNotifier = new EmailNotifier();
    public void confirmOrder() {
        System.out.println("Confirming order");
        emailNotifier.notify("Your order has been confirmed.");
    }
}
