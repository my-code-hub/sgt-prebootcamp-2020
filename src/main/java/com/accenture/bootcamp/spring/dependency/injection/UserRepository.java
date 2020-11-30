package com.accenture.bootcamp.spring.dependency.injection;

//data layer
class UserRepository {

    boolean isEmailUsedAlready(String email) {
        //search database and check if we already have
        //user with such email
        System.out.println("checking if user is in database...");
        return false;
    }

    boolean insertIntoDatabase(User user) {
        //send SQL query to database which inserts user
        //insert new row into users table in database
        return true;
    }
}
