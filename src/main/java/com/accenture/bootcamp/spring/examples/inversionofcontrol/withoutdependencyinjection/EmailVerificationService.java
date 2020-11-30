package com.accenture.bootcamp.spring.examples.inversionofcontrol.withoutdependencyinjection;

public class EmailVerificationService {

    public void sendVerificationEmail(String sendToEmail) {
        System.out.println("sending post verification email ...." + sendToEmail);
    }
}
