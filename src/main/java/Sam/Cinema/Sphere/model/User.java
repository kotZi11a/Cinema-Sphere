package Sam.Cinema.Sphere.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;


import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private int age;
    private String telephone;
    private String email;
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
    @JsonIgnoreProperties(value = "favorites")
    @ManyToMany
    @JoinTable(
            name = "Favorite_film",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    List<Film> favoriteFilm;
}
