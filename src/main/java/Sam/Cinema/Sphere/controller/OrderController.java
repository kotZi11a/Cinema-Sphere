package Sam.Cinema.Sphere.controller;

import Sam.Cinema.Sphere.model.Order;
import Sam.Cinema.Sphere.model.Session;
import Sam.Cinema.Sphere.model.User;
import Sam.Cinema.Sphere.repo.OrderRepo;
import Sam.Cinema.Sphere.service.OrderService;
import Sam.Cinema.Sphere.service.SessionService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    SessionService sessionService;

    @PostMapping("/createOrder")
    public String createOrder(@RequestParam int place, @RequestParam Time time, @RequestParam long ses_id, @RequestBody User user){
        Order order = new Order();
        order.setUser(user);
        order.setPlace(place);
        order.setSession(sessionService.getSessionById(ses_id));
        order.setStatus("Ожидание");
        order.setTime(time);
        orderService.save(order);
        return "Create new order";
    }

    @GetMapping("/all")
    public List<Order> getAll(){
        return orderService.getAll();
    }

    @GetMapping("/myOrder")
    public List<Order> getUserOrders(@RequestBody User user){
        return orderService.getOrderByUser(user);
    }



}
