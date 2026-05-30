package com.codingshuttle.saunak.Module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentService paymentService() {
        //you can define how the bean created and what to be created
        return new PaymentService();
    }

}
