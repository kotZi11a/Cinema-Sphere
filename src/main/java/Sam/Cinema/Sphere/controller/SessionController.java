package Sam.Cinema.Sphere.controller;

import Sam.Cinema.Sphere.model.Order;
import Sam.Cinema.Sphere.model.Session;
import Sam.Cinema.Sphere.repo.SessionRepo;
import Sam.Cinema.Sphere.service.OrderService;
import Sam.Cinema.Sphere.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public String addSession(@RequestBody Session session){
        sessionService.saveSession(session);
        return "Added new session";

    }
    @GetMapping("/getAll")
    public List<Session> sessionsAll(Model model){
        //model.addAttribute("sessions", sessions);
    return sessionService.getAllSes();
    }

//    @GetMapping("/sessions")
//    public String sessionsAll(Model model){
//        List<Session> sessions = sessionRepo.findAll();
//        model.addAttribute("sessions", sessions);
//        return "home.html";
//    }
    @GetMapping("/getOnDate")
    public List<Session> sessionsDate(Model model, @RequestParam String date){
        return sessionService.getAllSesByDate(Date.valueOf(date));
    }
    @PostMapping("/delete")
    public String deleteSes(@RequestParam Long id){
        List<Order> orders = orderService.getOrderBySes(sessionService.getSessionById(id));
        for (int i = 0; i < orders.size(); i++)
        {
            orders.get(i).setStatus("Отменено");
        }
        deleteSes(id);
        return "Session is delete";
    }

}
