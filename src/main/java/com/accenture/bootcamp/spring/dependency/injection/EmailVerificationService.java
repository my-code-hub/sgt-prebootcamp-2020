package com.accenture.bootcamp.spring.dependency.injection;

public class EmailVerificationService {

    public void sendVerificationEmail(String sendToEmail) {
        System.out.println("sending post verification email ...." + sendToEmail);
    }
}
