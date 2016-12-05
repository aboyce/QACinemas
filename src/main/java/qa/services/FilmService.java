package qa.services;

import qa.persistence.entities.Film;
import qa.persistence.repositories.FilmRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FilmService {

    @Inject
    private FilmRepository filmRepository;

    public List<Film> getFilms() {
        return filmRepository.getFilms();
    }
}
