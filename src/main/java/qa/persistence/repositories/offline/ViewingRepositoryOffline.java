package qa.persistence.repositories.offline;

import qa.persistence.entities.Film;
import qa.persistence.entities.Rating;
import qa.persistence.repositories.RatingRepository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Default
public class RatingRepositoryOffline implements RatingRepository {

    @Inject
    private DatabaseOffline db;


    @Override
    public Rating getRatingById(Integer id) {
        for (Rating rating : db.getRatings()) {
            if(rating.getId().equals(id)){
                return rating;
            }
        }
        return null;
    }

    @Override
    public List<Rating> getRatingsForFilm(Film film) {
        List<Rating> ratings = new ArrayList<Rating>();
        for (Rating rating : db.getRatings()) {
            if(rating.getFilm().getId().equals(film.getId())){
                ratings.add(rating);
            }
        }
        return ratings;
    }
}
