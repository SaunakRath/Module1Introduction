package com.codingshuttle.saunak.Module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component
//@Service
//@Repository
//@Controller
//@RestController
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }


    @PostConstruct
    public void afterinitiate() {
        System.out.println("Before payment done");
    }

    @PreDestroy
    public void beforeDestry() {
        System.out.println("after payment done");
    }
}