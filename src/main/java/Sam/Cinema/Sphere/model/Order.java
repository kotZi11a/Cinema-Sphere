package Sam.Cinema.Sphere.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate time;
    private int place;
    private String status;
    private long id_session;
    private long id_user;
}
