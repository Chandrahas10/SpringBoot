package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
//
//        Orderservice order =context.getBean(Orderservice.class);
//        Orderservice order2=context.getBean(Orderservice.class);
//
//        System.out.println(order2==order);
    }
}
