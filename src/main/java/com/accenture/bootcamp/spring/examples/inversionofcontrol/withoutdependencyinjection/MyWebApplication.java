package com.accenture.bootcamp.spring.examples.inversionofcontrol.withoutdependencyinjection;

public class MyWebApplication {

    public static void main(String[] args) {
        User user = new User("john.doe@mail.com", "John");

        RegistrationService registrationService
                = new RegistrationService();

        registrationService.register(user);
    }
}
