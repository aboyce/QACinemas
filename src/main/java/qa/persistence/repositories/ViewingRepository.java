package qa.persistence.repositories;

import qa.persistence.entities.Film;
import qa.persistence.entities.Venue;
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
     * Gets all Viewings for a Film and Venue.
     * @param film the Film to match the Viewings for.
     * @param venue the Venue to match the Viewings for.
     * @return a list of all Viewings for the matching Film and Venue.
     */
    public List<Viewing> getViewingsForFilmAndVenue(Film film, Venue venue);
}