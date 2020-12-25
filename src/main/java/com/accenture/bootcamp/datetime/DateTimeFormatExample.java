package com.accenture.bootcamp.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//more info: https://www.w3schools.com/java/java_date.asp
public class DateTimeFormatExample {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
}
