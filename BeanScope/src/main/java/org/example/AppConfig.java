package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class AppConfig {

    @Bean
    public Orderservice getOrder(){
        return  new Orderservice();
    }

    @Bean
    public  Orderservice getOrder2(){
        return  new Orderservice();
    }
}
