package Sam.Cinema.Sphere.model;


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
    @OneToMany(mappedBy = "film")
    private List<Session> sessions;
    @ManyToMany(mappedBy = "favoriteFilm")
    Set<User> favorites;
}
