package wemeet.az_web.dto;

import lombok.AllArgsConstructor;
import wemeet.az_web.enums.Status;

@AllArgsConstructor
public class PictureDto {
    private Long id;
    private String path;
    private Status status;
}
