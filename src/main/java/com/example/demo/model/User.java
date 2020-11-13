package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "users")
public class User {

    private static final String USER_ID = "userID";

    private static final String USER_NAME = "userName";

    private static final String PASS = "password";

    private static final String CREATED_AT = "created_ts";

    /**
     * the ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = USER_ID)
    private int id;

    @Column(name = USER_NAME)
    private String userName;

    @Column(name = PASS)
    private String passWord;

    @Column(name = CREATED_AT)
    private LocalDate createdAt;

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

}
