package com.accenture.bootcamp.spring.examples.inversionofcontrol.withdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service does the same as @Component
@Service
public class RegistrationService {

    //dependencies
    private final UserRepository userRepository;
    private final EmailVerificationService emailVerificationService;

    //Example of autowiring / injecting spring bean
    //via constructor
    @Autowired //this annotation is optional, spring would autowire these beans anyway
    public RegistrationService(UserRepository userRepository,
                               EmailVerificationService emailVerificationService) {
        this.userRepository = userRepository;
        this.emailVerificationService = emailVerificationService;
    }

    public void register(User user) {
        String email = user.getEmail();
        if (userRepository.isEmailUsedAlready(email)) {
            throw new IllegalArgumentException("User with " + email + " email exists already!");
        }
        System.out.println("email not found in database, registering new user");
        userRepository.insertIntoDatabase(user);
        emailVerificationService.sendVerificationEmail(email);
        //other business logic
    }
}
