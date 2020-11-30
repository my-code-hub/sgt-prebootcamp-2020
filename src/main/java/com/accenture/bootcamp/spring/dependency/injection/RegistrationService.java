package com.accenture.bootcamp.spring.dependency.injection;

public class RegistrationService {

    private UserRepository userRepository;
    private EmailVerificationService emailVerificationService;

    public void register(User user) {
        if (userRepository.isEmailUsedAlready(user.getEmail())) {
            throw new IllegalArgumentException("User with such email exists already!");
        }
        System.out.println("email not found in database, registering new user");
        userRepository.insertIntoDatabase(user);
        emailVerificationService.sendVerificationEmail(user.getEmail());
    }
}
