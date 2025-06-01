package wemeet.az_web.dto;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class QuizResponse {
    private Long id;
    private String question;

    private List<ChoiceDto> choiceDtos;
}
