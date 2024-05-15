package Sam.Cinema.Sphere.repo;

import Sam.Cinema.Sphere.model.Order;
import Sam.Cinema.Sphere.model.Session;
import Sam.Cinema.Sphere.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findAllByUser(User user);
    List<Order> findAllBySession(Session session);
}
