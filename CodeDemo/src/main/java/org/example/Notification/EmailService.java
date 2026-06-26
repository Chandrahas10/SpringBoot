package org.example.Notification;

public class EmailService implements Notification {
    @Override
    public  void sendNotification(){
        System.out.println("Email notification sent");
    }
}
