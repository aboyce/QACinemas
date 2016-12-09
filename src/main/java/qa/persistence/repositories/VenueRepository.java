package qa.persistence.repositories;

import qa.persistence.entities.Film;
import qa.persistence.entities.Venue;

import java.util.List;

public interface VenueRepository {

    /**
     * Gets a Venue that matches its Id.
     *
     * @param id the Id of the Venue to retrieve.
     * @return the matching Venue, or null if no match is found.
     */
    public Venue getVenueById(Integer id);

    /**
     * Get all Venues for a Film.
     *
     * @return a list of all Venues for the matching Film.
     */
    public List<Venue> getVenuesForFilm(Film film);
}