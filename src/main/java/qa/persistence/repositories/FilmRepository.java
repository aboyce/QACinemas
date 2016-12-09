package qa.persistence.repositories;

import qa.persistence.entities.Film;

import java.util.List;

public interface FilmRepository {

    /**
     * Gets a Film that matches its Id.
     *
     * @param id the Id of the Film to retrieve.
     * @return the matching Film, or null if no match is found.
     */
    public Film getFilmById(Integer id);

    /**
     * Get all films.
     *
     * @return a list of all Films
     */
    public List<Film> getFilms();

    /**
     * Get a specific number of films.
     *
     * @param numberOfFilms the number of Films to retrieve.
     * @return a list of numberOfFilms longs of Films.
     */
    public List<Film> getFilms(int numberOfFilms);
}
