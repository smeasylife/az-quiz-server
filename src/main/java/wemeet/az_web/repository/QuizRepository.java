package wemeet.az_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wemeet.az_web.domain.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findBySection(Integer section);
}
