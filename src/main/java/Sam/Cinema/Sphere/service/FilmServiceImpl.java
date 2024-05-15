package Sam.Cinema.Sphere.service;

import Sam.Cinema.Sphere.model.Film;
import Sam.Cinema.Sphere.repo.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService{
    @Autowired
    private FilmRepo filmRepo;
    @Override
    public List<Film> getAllFilm() {
        return filmRepo.findAll();
    }

    @Override
    public Film saveFilm(Film film) {
        return filmRepo.save(film);
    }

    @Override
    public Film getFilmById(Long id) {
        return filmRepo.findById(id).orElseThrow(() -> new RuntimeException("Film not found"));
    }
}
