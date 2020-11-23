package com.accenture.bootcamp.jdbc.examples;

public class JdbcExample {

    public static void main(String[] args) {
        TeacherRepository repository = new TeacherRepository();

        System.out.println(repository.findBy(1));

        repository.closeConnection();
    }
}
