package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Qualifier
@Component("up")
public class Upipayment implements  Payment{
    @Override
    public  void PaymentService(){
        System.out.println("UPI payment");
    }
}
