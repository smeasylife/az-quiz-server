package wemeet.az_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wemeet.az_web.dto.PictureDto;
import wemeet.az_web.service.PictureService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PictureController {
    private final PictureService pictureService;

    @GetMapping("/{section}/pictures")
    public List<PictureDto> getPictures(@PathVariable Integer section) {
        return pictureService.getPicturesBySection(section);
    }
}
