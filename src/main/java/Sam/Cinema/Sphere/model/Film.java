package Sam.Cinema.Sphere.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "films")
public class Film{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String country;
    private Time duration;
    private String descriprion;
    private int age;
    @JsonIgnoreProperties(value = "film")
    @OneToMany(mappedBy = "film")
    private List<Session> sessions;
    @JsonIgnoreProperties(value = "favoriteFilm")
    @ManyToMany(mappedBy = "favoriteFilm")
    Set<User> favorites;
}
