package factory;

import adapters.notification.EmailNotificationAdapter;
import adapters.notification.SmsNotificationAdapter;
import adapters.payment.PaypalPaymentAdapter;
import adapters.payment.StripePaymentAdapter;
import domain.NotificationPort;
import domain.PaymentPort;

public class AdapterFactory {

    public static PaymentPort createPaymentAdapter(
            String provider) {

        return switch (provider.toLowerCase()) {
            case "paypal" -> new PaypalPaymentAdapter();
            default -> new StripePaymentAdapter();
        };
    }

    public static NotificationPort createNotificationAdapter(
            String type) {

        return switch (type.toLowerCase()) {
            case "sms" -> new SmsNotificationAdapter();
            default -> new EmailNotificationAdapter();
        };
    }
}