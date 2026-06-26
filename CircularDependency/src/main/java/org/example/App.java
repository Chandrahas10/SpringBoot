package org.example;
import  org.example.simple.A;
import  org.example.simple.B;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Orderservice order =context.getBean(Orderservice.class);
        order.placeOrder();

//        A a =new A();

    }
}
