package com.quiz.controllers;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }


    // create
    @PostMapping("/post")
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    // get all
    @GetMapping("/getAll")
    public List<Quiz> getAll() {
        return quizService.getAll();
    }

    @GetMapping("/getOne/{id}")
    public Quiz get(@PathVariable Long id) {
        return quizService.get(id);
    }

}
