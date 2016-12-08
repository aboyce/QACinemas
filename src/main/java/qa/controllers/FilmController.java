package qa.controllers;

import qa.persistence.entities.Film;
import qa.persistence.entities.Rating;
import qa.services.FilmService;
import qa.services.RatingService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("films")
@RequestScoped
public class FilmController {

    @Inject
    private FilmService filmService;

    @Inject
    private RatingService ratingService;

    public List<Film> getFilms() {
        return filmService.getFilms();
    }

    public List<Rating> getRatingsForFilm(Film film) {

        if(film == null) {
            return null;
        }

        return ratingService.getRatingsForFilm(film);
    }
}
