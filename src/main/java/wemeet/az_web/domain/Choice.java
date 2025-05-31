package wemeet.az_web.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private Integer index;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "choice_id")
    private Quiz quiz;
}
