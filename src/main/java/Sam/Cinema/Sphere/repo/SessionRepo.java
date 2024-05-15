package Sam.Cinema.Sphere.repo;

import Sam.Cinema.Sphere.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface SessionRepo extends JpaRepository<Session, Long> {
    List<Session> findAllByDate(Date date);
}
