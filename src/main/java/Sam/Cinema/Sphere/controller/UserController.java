package Sam.Cinema.Sphere.controller;


import Sam.Cinema.Sphere.model.Film;
import Sam.Cinema.Sphere.model.User;
import Sam.Cinema.Sphere.repo.FilmRepo;
import Sam.Cinema.Sphere.repo.UserRepo;
import Sam.Cinema.Sphere.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private FilmRepo filmRepo;

    @GetMapping("/all")
    public List<User> allUsers(){
        return userService.getAllUser();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "Added new user";
    }


}
