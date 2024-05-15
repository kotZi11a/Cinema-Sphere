package Sam.Cinema.Sphere.service;

import Sam.Cinema.Sphere.model.Film;

import java.util.List;

public interface FilmService {
    public List<Film> getAllFilm();
    public Film saveFilm(Film film);
    public Film getFilmById(Long id);
}
