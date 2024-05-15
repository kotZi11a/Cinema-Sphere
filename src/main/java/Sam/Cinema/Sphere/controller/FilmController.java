package Sam.Cinema.Sphere.controller;

import Sam.Cinema.Sphere.model.Film;
import Sam.Cinema.Sphere.model.User;
import Sam.Cinema.Sphere.service.FilmService;
import Sam.Cinema.Sphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addFilm(@RequestBody Film film){
        filmService.saveFilm(film);
        return "Added new film";
    }

    @PostMapping("/addFavorite")
    public User addFavoriteFilm(@RequestParam Long user_id, @RequestParam Long film_id){
        User user = userService.getUserById(user_id);
        Film film = filmService.getFilmById(film_id);
        user.getFavoriteFilm().add(film);
        return userService.addUser(user);
    }
    @GetMapping("/favorites")
    public List<Film> favoriteFilm(@RequestParam Long user_id){
        User fav_user = userService.getUserById(user_id);
        return fav_user.getFavoriteFilm();
    }
    @GetMapping("/getAll")
    public List<Film> filmAll(){
        return filmService.getAllFilm();
    }
}
