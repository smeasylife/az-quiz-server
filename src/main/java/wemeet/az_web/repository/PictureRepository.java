package wemeet.az_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import wemeet.az_web.domain.Picture;
import wemeet.az_web.dto.PictureDto;

import java.util.List;

public interface PictureRepository extends JpaRepository<Picture, Long> {
    @Query("select new wemeet.az_web.dto.PictureDto(p.id, p.path) from Picture p where p.section = :section")
    List<PictureDto> findAllPictureBySection(Integer section);
}
