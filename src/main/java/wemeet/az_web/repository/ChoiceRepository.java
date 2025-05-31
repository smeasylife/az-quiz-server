package wemeet.az_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wemeet.az_web.domain.Choice;

public interface ChoiceRepository extends JpaRepository<Choice, Long> {
}
