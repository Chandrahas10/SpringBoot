package org.example;

import org.springframework.stereotype.Component;

@Component
public class Orderservice {
    private  Paymentservice paymentservice;

    public  Orderservice(Paymentservice paymentservice){
        this.paymentservice =paymentservice;
    }

    public  void placeOrder(){
        paymentservice.pay();

        System.out.println("Order is placed");
    }

    public  void getOrderDetail(){
        System.out.println("Oder Details");
    }
}
