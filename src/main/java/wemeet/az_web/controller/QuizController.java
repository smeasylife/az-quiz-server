package wemeet.az_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wemeet.az_web.domain.Choice;
import wemeet.az_web.service.QuizService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @GetMapping("/quiz/{section}")
    public List<Choice> getQuiz(@PathVariable Integer section) {

    }
}
