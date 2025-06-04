package wemeet.az_web.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private Integer answerIndex;

    private Integer section;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.REMOVE)
    private List<Choice> choices = new ArrayList<>();
}
