package org.example;

import org.springframework.stereotype.Component;

@Component
public class Paymentservice {

    Orderservice orderservice ;

    public  Paymentservice(Orderservice orderservice){
        this.orderservice=orderservice;
    }

    public  void pay(){
        System.out.println("Payment is done");
        orderservice.getOrderDetail();
    }
}
