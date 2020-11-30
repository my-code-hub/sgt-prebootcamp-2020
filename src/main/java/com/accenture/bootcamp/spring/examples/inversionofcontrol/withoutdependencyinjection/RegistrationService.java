package com.accenture.bootcamp.spring.examples.inversionofcontrol.withoutdependencyinjection;

public class RegistrationService {

    //dependencies
    private final UserRepository userRepository;
    private final EmailVerificationService emailVerificationService;

    public RegistrationService() {
        this.userRepository = new UserRepository();
        this.emailVerificationService = new EmailVerificationService();
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
