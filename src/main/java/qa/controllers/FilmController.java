package qa.controllers;

import qa.persistence.entities.Film;
import qa.persistence.entities.Rating;
import qa.persistence.entities.Venue;
import qa.persistence.entities.Viewing;
import qa.persistence.repositories.VenueRepository;
import qa.services.FilmService;
import qa.services.RatingService;
import qa.services.ViewingService;

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

    @Inject
    private ViewingService viewingService;

    @Inject
    private VenueRepository venueRepository;

    public List<Film> getFilms() {
        return filmService.getFilms();
    }

    public List<Rating> getRatingsForFilm(Film film) {

        if (film == null) {
            return null;
        }

        return ratingService.getRatingsForFilm(film);
    }

    public List<Viewing> getViewingsForFilm(Film film) {
        if (film == null) {
            return null;
        }

        return viewingService.getViewingsForFilm(film);
    }

    public List<Venue> getVenuesForFilm(Film film) {
        if (film == null) {
            return null;
        }

        return venueRepository.getVenuesForFilm(film);
    }
}