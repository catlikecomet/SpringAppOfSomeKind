package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name= "quiz_reference")
public class Quiz {

    /**
     * the ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizID;
    private String quiz_name;

    public Quiz(){}

    public Quiz(int quizID, String quiz_name) {
        this.quizID= quizID;
        this.quiz_name = quiz_name;

    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public String getQuiz_name() {
        return quiz_name;
    }

    public void setQuiz_name(String quiz_name) {
        this.quiz_name = quiz_name;
    }

}
