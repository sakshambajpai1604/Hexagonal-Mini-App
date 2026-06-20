package adapters.notification;

import domain.NotificationPort;

public class SmsNotificationAdapter
        implements NotificationPort {

    @Override
    public void sendNotification(String message) {

        System.out.println(
                "SMS SENT -> " + message);
    }
}