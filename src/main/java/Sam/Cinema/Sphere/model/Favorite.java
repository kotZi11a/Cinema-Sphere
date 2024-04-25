package Sam.Cinema.Sphere.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "favorite")
public class Favorite {
    private long film_id;
    private long user_id;
}
