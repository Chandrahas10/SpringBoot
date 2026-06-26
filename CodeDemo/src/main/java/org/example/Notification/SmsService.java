package org.example.Notification;

public class SmsService implements  Notification{
    @Override
    public void sendNotification(){
        System.out.println("Sms notification send");
    }
}
