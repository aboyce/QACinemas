package qa.persistence.repositories.offline;

import qa.persistence.entities.*;
import qa.persistence.generation.EntityGeneration;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides just the actual storage of the Entities, as they are Lists, it will just pass them back and the Repositories can carry out the logic.
 */
@Singleton
public class DatabaseOffline {

    private List<Film> films;
    private List<Rating> ratings;
    private List<User> users;
    private List<Venue> venues;
    private List<Viewing> viewings;

    @PostConstruct
    private void setupDatabase() {
        films = EntityGeneration.getSampleFilms();
        ratings = EntityGeneration.getSampleRatings(films);
        users = EntityGeneration.getSampleUsers();
        venues = EntityGeneration.getSampleVenues();
        viewings = EntityGeneration.getSampleViewings(new ArrayList<>(films), new ArrayList<>(venues));
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public List<Viewing> getViewings() {
        return viewings;
    }
}
