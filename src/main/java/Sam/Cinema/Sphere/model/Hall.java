package Sam.Cinema.Sphere.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnoreProperties(value = "hall")
    @OneToMany(mappedBy = "hall")
    private List<Session> sessions;
}
