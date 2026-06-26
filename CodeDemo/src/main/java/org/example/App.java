package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.FakeEmailservice;
import org.example.Notification.Notification;
import org.example.Notification.SmsService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Notification notification =new FakeEmailservice();
        System.out.println( "Hello World!" );
        OrderService orders =new OrderService(notification);
        orders.Orderpick();
    }
}
