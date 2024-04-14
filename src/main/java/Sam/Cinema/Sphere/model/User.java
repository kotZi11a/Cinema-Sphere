package Sam.Cinema.Sphere.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

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
    @NonNull
    private String email;
    private String role;
}
