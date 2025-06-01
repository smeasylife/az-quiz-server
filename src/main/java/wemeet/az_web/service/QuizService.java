package wemeet.az_web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wemeet.az_web.domain.Choice;
import wemeet.az_web.domain.Quiz;
import wemeet.az_web.dto.ChoiceDto;
import wemeet.az_web.dto.QuizResponse;
import wemeet.az_web.exception.QuizNotFoundException;
import wemeet.az_web.repository.QuizRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;

    public List<QuizResponse> getQuiz(Integer section) {
        List<Quiz> quizs = quizRepository.findBySection(section);

        List<QuizResponse> quizResponses = new ArrayList<>();

        for (Quiz quiz : quizs) {
            List<ChoiceDto> choiceDtos = quiz.getChoices().stream()
                    .map(choice -> new ChoiceDto(choice.getContent(), choice.getIndex()))
                    .collect(Collectors.toList());

            quizResponses.add(new QuizResponse(
                    quiz.getId(),
                    quiz.getQuestion(),
                    choiceDtos
            ));
        }

        return quizResponses;
    }
}