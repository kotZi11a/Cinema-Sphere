package Sam.Cinema.Sphere.repo;

import Sam.Cinema.Sphere.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepo extends JpaRepository<Film, Long> {
}
