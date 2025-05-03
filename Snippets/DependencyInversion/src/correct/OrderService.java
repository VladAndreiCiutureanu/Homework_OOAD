package correct;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Notifier> notifiers;

    public OrderService() {
        notifiers = new ArrayList<>();
    }

    public void addNotifier(Notifier notifier) {
        notifiers.add(notifier);
    }

    public void confirmOrder() {
        System.out.println("Confirming order");
        notifiers.forEach(notifier -> notifier.notify("Your order has been confirmed."));
    }
}
