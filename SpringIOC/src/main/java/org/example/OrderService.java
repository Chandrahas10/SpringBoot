package org.example;

import org.example.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    @Autowired
    private  final Payment payservice;  // Dependency Injection using the field Injection



    @Autowired
   public OrderService(@Qualifier ("cp") Payment payservice){  // Dependency using the constructor best approach
       this.payservice=payservice;
   }

//@Autowired
//    public void setPayservice(Payment payservice) {   Dependency injection using the setter injection
//        this.payservice = payservice;
//    }

    public void Orderplaced(){
       payservice.PaymentService();
        System.out.println("Order Placed ");


    }
}
