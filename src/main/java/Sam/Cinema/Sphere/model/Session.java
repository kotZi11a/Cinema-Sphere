package Sam.Cinema.Sphere.model;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Time time;
    private Date date;
    private long id_film;
    private int id_hall;
}
