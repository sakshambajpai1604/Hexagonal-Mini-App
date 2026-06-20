package app;

import domain.OrderService;
import domain.PaymentPort;
import domain.NotificationPort;
import factory.AdapterFactory;

public class Main {

    public static void main(String[] args) {

        String paymentProvider = "stripe";
        String notificationType = "email";

        PaymentPort payment =
                AdapterFactory.createPaymentAdapter(
                        paymentProvider);

        NotificationPort notification =
                AdapterFactory.createNotificationAdapter(
                        notificationType);

        OrderService orderService =
                new OrderService(payment, notification);

        orderService.placeOrder(1500);
    }
}