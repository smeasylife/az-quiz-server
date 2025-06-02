package wemeet.az_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wemeet.az_web.domain.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
