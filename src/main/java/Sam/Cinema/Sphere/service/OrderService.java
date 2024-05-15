package Sam.Cinema.Sphere.service;

import Sam.Cinema.Sphere.model.Order;
import Sam.Cinema.Sphere.model.Session;
import Sam.Cinema.Sphere.model.User;

import java.util.List;

public interface OrderService {
    public List<Order> getAll();
    public List<Order> getOrderByUser(User user);
    public Order save(Order order);
    public List<Order> getOrderBySes(Session session);
}
