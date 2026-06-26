package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Paymentservice {

    @Autowired
    Orderservice orderservice ;

//    public  Paymentservice(Orderservice orderservice){
//        this.orderservice=orderservice;
//    }

    public  void pay(){
        System.out.println("Payment is done");
        orderservice.getOrderDetail();
    }
}
