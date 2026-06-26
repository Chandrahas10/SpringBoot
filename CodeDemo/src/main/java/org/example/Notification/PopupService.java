package org.example.Notification;

public class PopupService implements  Notification{
    @Override
    public  void sendNotification(){
        System.out.println("Pop up notification send");
    }
}
