package qa.persistence.repositories;

import qa.persistence.entities.Film;

import java.util.List;

public interface FilmRepository {

    public Film getFilmById(Integer id);
    public List<Film> getFilms();
}
