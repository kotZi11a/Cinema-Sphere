package Sam.Cinema.Sphere.controller;


import Sam.Cinema.Sphere.model.User;
import Sam.Cinema.Sphere.repo.UserRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepo repo;

    @GetMapping("/addUser")
    public void addUser(@RequestBody User user) {
        repo.save(user);
    }
}
