package wemeet.az_web.domain;

import jakarta.persistence.*;
import lombok.Getter;
import wemeet.az_web.enums.Status;

@Entity
@Getter
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String path;

    private Integer section;
}
