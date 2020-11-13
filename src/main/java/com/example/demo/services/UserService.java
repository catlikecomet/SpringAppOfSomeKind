package com.example.demo.services;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends DatabaseService {
    public List<User> getAllUsers() {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM users")
                        .mapToBean(User.class).list());
    }
}
