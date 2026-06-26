package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier
@Component("cp")
public class CardPayment implements  Payment{
    @Override
    public void PaymentService(){
        System.out.println("Card Payment");
    }
}
