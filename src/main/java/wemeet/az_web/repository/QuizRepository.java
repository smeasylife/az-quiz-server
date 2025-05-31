package wemeet.az_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wemeet.az_web.domain.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
