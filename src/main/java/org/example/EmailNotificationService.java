package org.example;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Mandandando un mail...");
    }
}
