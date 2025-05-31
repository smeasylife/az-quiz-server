package wemeet.az_web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wemeet.az_web.domain.Choice;
import wemeet.az_web.domain.Quiz;
import wemeet.az_web.exception.QuizNotFoundException;
import wemeet.az_web.repository.ChoiceRepository;
import wemeet.az_web.repository.QuizRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;
    private final ChoiceRepository choiceRepository;

    public List<Choice> getQuiz(Integer section) {
        Quiz quiz = quizRepository.findBySection(section).orElseThrow(() ->
                new QuizNotFoundException("Quiz not found with given section: " + section));
        return quiz.getChoices();
    }
}