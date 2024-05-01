package Sam.Cinema.Sphere.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;


@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Time time;
    private int place;
    private String status;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;
}
