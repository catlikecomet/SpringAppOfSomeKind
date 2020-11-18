package com.example.demo.services;

import com.example.demo.model.Quiz;
import com.example.demo.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAll() {
        Iterable<Quiz> quizzes = quizRepository.findAll();
        return StreamSupport.stream(quizzes.spliterator(),
                false).sorted(Comparator.comparing(Quiz::getQuiz_name)).collect(Collectors.toList());
    }

    public Optional<Quiz> findById(int id) {
        return quizRepository.findById(id);
    }

    public Quiz updateOrCreateQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(int id ){
        quizRepository.deleteById(id);
    }
}
