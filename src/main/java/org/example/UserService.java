package org.example;

public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void registerService(String userName){
        notificationService.sendNotification(userName);
    }
}
