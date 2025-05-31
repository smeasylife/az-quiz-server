package wemeet.az_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
    @GetMapping("/quiz/{section}")
    public String getQuiz(@PathVariable Integer section) {

    }
}
