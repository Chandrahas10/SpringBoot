package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Orderservice {
    @Autowired
    private  Paymentservice paymentservice;

//    public  Orderservice(Paymentservice paymentservice){
//        this.paymentservice =paymentservice; //bcoz of constructor
//    }

    public  void placeOrder(){
        paymentservice.pay();

        System.out.println("Order is placed");
    }

    public  void getOrderDetail(){
        System.out.println("Oder Details");
    }
}
