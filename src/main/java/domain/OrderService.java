package domain;

public class OrderService {

    private final PaymentPort paymentPort;
    private final NotificationPort notificationPort;

    public OrderService(
            PaymentPort paymentPort,
            NotificationPort notificationPort) {

        this.paymentPort = paymentPort;
        this.notificationPort = notificationPort;
    }

    public void placeOrder(double amount) {

        if (paymentPort.processPayment(amount)) {

            notificationPort.sendNotification(
                    "Order placed successfully. Amount: ₹" + amount);

            System.out.println("Order completed");
        } else {
            System.out.println("Payment failed");
        }
    }
}
