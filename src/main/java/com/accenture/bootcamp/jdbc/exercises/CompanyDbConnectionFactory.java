package com.accenture.bootcamp.jdbc.exercises;

import java.sql.Connection;
import java.sql.DriverManager;

class CompanyDbConnectionFactory {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DB_NAME = "company";
    private static final String DB_URI = "jdbc:mysql://localhost:3306/" + DB_NAME
            + "?autoReconnect=true&useSSL=false&characterEncoding=utf8";

    static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URI, USERNAME, PASSWORD);
            connection.setAutoCommit(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
