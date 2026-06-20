package test;

import domain.NotificationPort;
import domain.OrderService;
import domain.PaymentPort;

public class OrderServiceTest {

    public static void main(String[] args) {

        PaymentPort mockPayment = amount -> true;

        NotificationPort mockNotification =
                message -> System.out.println(
                        "MOCK NOTIFICATION: " + message);

        OrderService service =
                new OrderService(
                        mockPayment,
                        mockNotification);

        service.placeOrder(1000);

        System.out.println("TEST PASSED");
    }
}