package wemeet.az_web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class QuizResponse {
    private Long id;
    private String question;

    private List<ChoiceDto> choiceDtos;
}
