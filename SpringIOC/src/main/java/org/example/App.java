package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context =new AnnotationConfigApplicationContext(AppConfig.class);
//       OrderService order =new OrderService();
        OrderService order =context.getBean(OrderService.class);
        order.Orderplaced();
//        Payment payment = context.getBean((Payment.class));
//        payment.PaymentService();

        User user =context.getBean(User.class);
        System.out.println(user.getName());
    }
}
