package adapters.notification;

import domain.NotificationPort;

public class EmailNotificationAdapter
        implements NotificationPort {

    @Override
    public void sendNotification(String message) {

        System.out.println(
                "EMAIL SENT -> " + message);
    }
}