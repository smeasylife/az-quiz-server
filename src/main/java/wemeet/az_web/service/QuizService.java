package wemeet.az_web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wemeet.az_web.domain.Choice;
import wemeet.az_web.domain.Quiz;
import wemeet.az_web.dto.QuizResponse;
import wemeet.az_web.exception.QuizNotFoundException;
import wemeet.az_web.repository.QuizRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;

    public List<QuizResponse> getQuiz(Integer section) {
        Quiz quiz = quizRepository.findBySection(section).orElseThrow(() ->
                new QuizNotFoundException("Quiz not found with given section: " + section));
        List<Choice> choices = quiz.getChoices();

        return choices.stream()
                .map(choice -> new QuizResponse(choice.getContent(), choice.getIndex()))
                .collect(Collectors.toList());
    }
}