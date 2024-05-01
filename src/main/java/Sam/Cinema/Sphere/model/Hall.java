package Sam.Cinema.Sphere.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "halls")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int places;
    @OneToMany(mappedBy = "hall")
    private List<Session> sessions;
}
