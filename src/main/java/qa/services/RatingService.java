package qa.services;

import qa.persistence.entities.Film;
import qa.persistence.entities.Rating;
import qa.persistence.repositories.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class RatingService {

    @Inject
    private RatingRepository ratingRepository;

    public List<Rating> getRatingsForFilm(Film film) {
        return ratingRepository.getRatingsForFilm(film);
    }

}
