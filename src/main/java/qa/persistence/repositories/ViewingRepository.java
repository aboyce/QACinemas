package qa.persistence.repositories;

import qa.persistence.entities.Film;
import qa.persistence.entities.Viewing;

import java.util.List;

public interface ViewingRepository {

    /**
     * Gets a Viewing that matches its Id.
     *
     * @param id the Id of the Viewing to retrieve.
     * @return the matching Viewing, or null if no match is found.
     */
    public Viewing getViewingById(Integer id);

    /**
     * Get all Viewings for a Film.
     *
     * @return a list of all Viewings for the matching Film.
     */
    public List<Viewing> getViewingsForFilm(Film film);
}