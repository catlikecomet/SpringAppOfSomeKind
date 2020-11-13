package com.example.demo.services;

import org.jdbi.v3.core.Jdbi;

public abstract class DatabaseService {

    private final String connection = "jdbc:mysql://localhost/test_quiz?user=root&password=&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";

    protected final Jdbi jdbi = Jdbi.create(connection);
}
