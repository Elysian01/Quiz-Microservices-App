package com.question.controllers;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // create
    @PostMapping("/post")
    public Question create(@RequestBody Question quiz){
        return questionService.add(quiz);
    }

    // get all
    @GetMapping("/getAll")
    public List<Question> getAll() {
        return questionService.getAll();
    }

    @GetMapping("/getOne/{id}")
    public Question get(@PathVariable Long id) {
        return questionService.get(id);
    }

    // Get all Question of Specfic Quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId) {
        return questionService.getQuestionsofQuiz(quizId);
    }
}
