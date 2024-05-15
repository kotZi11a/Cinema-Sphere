package Sam.Cinema.Sphere.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.util.List;


@Data
@Entity
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Time time;
    private Date date;
    @JsonIgnoreProperties(value = "sessions")
    @ManyToOne
    @JoinColumn(name="hall_id")
    private Hall hall;
    @JsonIgnoreProperties(value = "sessions")
    @ManyToOne
    @JoinColumn(name="film_id")
    private Film film;
    @JsonIgnoreProperties(value = "session")
    @OneToMany(mappedBy = "session")
    private List<Order> orders;
}
