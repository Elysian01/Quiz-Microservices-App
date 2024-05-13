package com.question.services.implementations;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;
import com.question.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplementations implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImplementations(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question add(Question quiz) {
        return questionRepository.save(quiz);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question get(Long id) {
        return questionRepository.findById(id).orElseThrow( () -> new RuntimeException("Question Not Found"));
    }

    @Override
    public List<Question> getQuestionsofQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
