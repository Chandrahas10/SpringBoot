package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope("singleton")
public class Orderservice {

    public Orderservice(){
        System.out.println("Order service is created");
    }

    public  void placeOrder(){
        System.out.println("Order is placed");
    }
}
