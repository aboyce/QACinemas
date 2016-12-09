package qa.persistence.repositories.offline;

import qa.persistence.entities.Venue;
import qa.persistence.repositories.VenueRepository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
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
    public List<Venue> getVenues() {
        return db.getVenues();
    }
}