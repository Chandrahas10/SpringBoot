package org.example.Notification;

public class FakeEmailservice implements  Notification{
    @Override
    public void sendNotification(){
        System.out.println("Dummy Email sent");
    }

}
