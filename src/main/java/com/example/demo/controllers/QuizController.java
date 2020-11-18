package com.example.demo.controllers;

import com.example.demo.model.Quiz;
import com.example.demo.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@RestController
public class QuizController {

    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("")
    public ModelAndView getAllUsers() {
        List<Quiz> quizzes = quizService.getAll();
        return new ModelAndView("index", "quizzes", quizzes);
    }

    @GetMapping("/quiz/{id}")
    public ModelAndView editQuiz(@PathVariable int id) {
        Optional<Quiz> quiz = quizService.findById(id);

        return new ModelAndView("edit", "quiz", quiz.get());
    }

    @GetMapping("/quiz")
    public ModelAndView addQuiz() {
        return new ModelAndView("new", "quiz", new Quiz());
    }

    @PostMapping("/quiz/{id}")
    public RedirectView updateQuiz(@ModelAttribute Quiz quiz, @PathVariable int id) {
        quiz.setQuizID(id);
        quizService.updateOrCreateQuiz(quiz);

        return new RedirectView("/");
    }

    @PostMapping("/quiz")
    public RedirectView createQuiz(@ModelAttribute Quiz quiz) {
        quizService.updateOrCreateQuiz(quiz);

        return new RedirectView("/");
    }

    @GetMapping("/quiz/delete/{id}")
    public RedirectView deleteQuiz(@PathVariable int id) {
        quizService.deleteQuiz(id);

        return new RedirectView("/");
    }
}
