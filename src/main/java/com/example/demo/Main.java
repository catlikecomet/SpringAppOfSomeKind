package com.example.demo;

import com.example.demo.model.User;
import org.jdbi.v3.core.Jdbi;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        String hostname = "localhost";
        String database = "test_quiz";
        String user = "root";
        String password = "";
        String connectionString = "jdbc:mysql://" + hostname + "/" + database + "?user=" + user + "&password=" + password + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT&useSSL=false";

        //jdbcMethod(connectionString);
        jdbiMethod(connectionString);
    }

    private static void jdbiMethod(String connectionString) {
        System.out.println("\nJDBI method...");

        // TODO: print out the details of all the books (using JDBI)
        // See this page for details: http://jdbi.org
        // Use the "Book" class that we've created for you (in the models.database folder)

        Jdbi jdbi = Jdbi.create(connectionString);

        List<User> users = jdbi.withHandle(handle ->{
//            handle.createUpdate("INSERT INTO Books(bookId, ISBN, Title, Author, Descrip, Genre) VALUES (:bookId, :ISBN, :Title, :Author, :Descrip, :Genre)")
//                    .bind("bookId", )

            return handle.createQuery("SELECT * FROM users")
                    .mapToBean(User.class)
                    .list();
        });
        for(int x =0; x <users.size(); x++) {
            System.out.println(users.get(x).getUserName()+ " "+users.get(x).getPassWord());


            // System.out.println();

        }

    }
}
