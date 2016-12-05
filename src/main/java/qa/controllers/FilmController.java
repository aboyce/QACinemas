package qa.controllers;

import qa.persistence.entities.Film;
import qa.services.FilmService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("films")
@RequestScoped
public class FilmController {

    @Inject
    private FilmService filmService;

    public List<Film> getFilms() {
        return filmService.getFilms();
    }

}
