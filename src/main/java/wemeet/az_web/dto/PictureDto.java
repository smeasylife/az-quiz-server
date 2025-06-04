package wemeet.az_web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import wemeet.az_web.enums.Status;

@Getter
@AllArgsConstructor
public class PictureDto {
    private Long id;
    private String path;
    private Status status;
}
