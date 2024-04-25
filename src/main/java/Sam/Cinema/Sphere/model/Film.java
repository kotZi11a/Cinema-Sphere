package Sam.Cinema.Sphere.model;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Data
@Entity
@Table(name = "films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String country;
    private Time duration;
    private String descriprion;
    private int age;
}
