package Sam.Cinema.Sphere.controller;

import Sam.Cinema.Sphere.model.Order;
import Sam.Cinema.Sphere.model.Session;
import Sam.Cinema.Sphere.model.User;
import Sam.Cinema.Sphere.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalTime;

@RestController
public class OrderController {
    @Autowired
    OrderRepo repo;

    @GetMapping("/createOrder")
    public void createOrder(@RequestParam int place, @RequestParam LocalTime time, @RequestParam long ses_id, @RequestBody User user){
    }


}
