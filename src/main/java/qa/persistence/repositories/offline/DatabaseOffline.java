package qa.persistence.repositories.offline;

import qa.persistence.entities.*;
import qa.persistence.generation.EntityGeneration;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.List;

/**
 * Provides just the actual storage of the Entities, as they are Lists, it will just pass them back and the Repositories can carry out the logic.
 */
@Singleton
public class DatabaseOffline {

    private List<User> users;
    private List<Film> films;
    private List<Rating> ratings;
    private List<Viewing> viewings;
    private List<Seat> seats;

    @PostConstruct
    private void setupDatabase() {
        users = EntityGeneration.getSampleUsers();
        films = EntityGeneration.getSampleFilms();
        ratings = EntityGeneration.getSampleRatings();
        viewings = EntityGeneration.getSampleViewings();
        seats = EntityGeneration.getSampleSeats();
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public List<Viewing> getViewings() {
        return viewings;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
