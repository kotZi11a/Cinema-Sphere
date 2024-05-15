package Sam.Cinema.Sphere.service;

import Sam.Cinema.Sphere.model.Order;
import Sam.Cinema.Sphere.model.Session;
import Sam.Cinema.Sphere.model.User;
import Sam.Cinema.Sphere.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepo orderRepo;
    @Override
    public List<Order> getAll() {
        return orderRepo.findAll();
    }

    @Override
    public List<Order> getOrderByUser(User user) {
        return orderRepo.findAllByUser(user);
    }

    @Override
    public Order save(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public List<Order> getOrderBySes(Session session) {
        return orderRepo.findAllBySession(session);
    }
}
