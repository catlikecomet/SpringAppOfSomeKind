package com.example.demo.page;

import com.example.demo.model.Quiz;

import java.util.List;

public class UserPageModel {

    private List<Quiz> quizzes;


    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }
}
