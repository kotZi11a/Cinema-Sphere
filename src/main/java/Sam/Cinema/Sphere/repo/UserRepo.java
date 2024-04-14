package Sam.Cinema.Sphere.repo;

import Sam.Cinema.Sphere.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Long> {
}
