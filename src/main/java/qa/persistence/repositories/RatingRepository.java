package qa.persistence.repositories;

import qa.persistence.entities.Film;
import qa.persistence.entities.Rating;

import java.util.List;

public interface RatingRepository {

    /**
     * Gets a Rating that matches its Id.
     * @param id the Id of the Rating to retrieve.
     * @return the matching Rating, or null if no match is found.
     */
    public Rating getRatingById(Integer id);

    /**
     * Get all Ratings for a Film.
     * @return a list of all Ratings for the matching Film.
     */
    public List<Rating> getRatingsForFilm(Film film);
}
