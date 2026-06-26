package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.Notification;
import org.example.Notification.PopupService;

public class OrderService {
    Notification notification ;
    public OrderService(Notification notification){
        this.notification =notification;
    }



    public  void Orderpick(){
        System.out.println("Your order is ready");
        notification.sendNotification();
    }
}
