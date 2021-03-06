package qa.services;

import qa.persistence.entities.Venue;
import qa.persistence.repositories.VenueRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class VenueService {

    @Inject
    private VenueRepository venueRepository;

    public List<Venue> getVenues() {
        return venueRepository.getVenues();
    }
}