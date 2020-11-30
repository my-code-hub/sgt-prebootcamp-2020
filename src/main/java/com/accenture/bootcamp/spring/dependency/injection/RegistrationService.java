package com.accenture.bootcamp.spring.dependency.injection;

public class RegistrationService {

    private UserRepository userRepository;
    private EmailVerificationService emailVerificationService;

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
