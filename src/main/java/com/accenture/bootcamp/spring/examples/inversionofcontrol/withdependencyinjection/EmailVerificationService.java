package com.accenture.bootcamp.spring.examples.inversionofcontrol.withdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class EmailVerificationService {

    public void sendVerificationEmail(String sendToEmail) {
        System.out.println("sending post verification email ...." + sendToEmail);
    }
}
