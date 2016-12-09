package qa.persistence.repositories.offline;

import qa.persistence.entities.Film;
import qa.persistence.entities.Venue;
import qa.persistence.repositories.VenueRepository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Default
public class VenueRepositoryOffline implements VenueRepository {

    @Inject
    private DatabaseOffline db;

    @Override
    public Venue getVenueById(Integer id) {
        for (Venue venue : db.getVenues()) {
            if (venue.getId().equals(id)) {
                return venue;
            }
        }
        return null;
    }

    @Override
    public List<Venue> getVenuesForFilm(Film film) {
        List<Venue> venues = new ArrayList<Venue>();
        for (Venue venue : db.getVenues()) {
            if (venue.getId().equals(film.getId())) {
                venues.add(venue);
            }
        }
        return venues;
    }
}