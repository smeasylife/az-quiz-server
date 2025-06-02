package wemeet.az_web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wemeet.az_web.dto.PictureDto;
import wemeet.az_web.repository.PictureRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PictureService {
    private final PictureRepository pictureRepository;

    public List<PictureDto> getPicturesBySection(Integer section) {
        return pictureRepository.findAllPictureBySection(section);
    }
}
