package wemeet.az_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wemeet.az_web.dto.QuizResponse;
import wemeet.az_web.service.QuizService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @GetMapping("/quiz/{section}")
    public List<QuizResponse> getQuiz(@PathVariable Integer section) {
        return quizService.getQuiz(section);
    }

    @PostMapping("/quiz/{quizId}/validate")
    public ResponseEntity<String> validateQuiz(@PathVariable Long quizId, @RequestParam Integer index) {
        if (quizService.validateQuiz(quizId, index)) {
            return ResponseEntity.ok("Pass");
        }
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Wrong Answer");
    }
}
