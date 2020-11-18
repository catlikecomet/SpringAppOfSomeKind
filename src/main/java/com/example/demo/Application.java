package com.example.demo;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource(
                "jdbc:mysql://localhost:3306/test_quiz",
                "root",
                "").load();
        flyway.migrate();

        SpringApplication.run(Application.class, args);
    }
}


