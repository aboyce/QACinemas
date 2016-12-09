package qa.controllers;

import qa.persistence.entities.Venue;
import qa.services.VenueService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("venues")
@RequestScoped
public class VenueController {

    @Inject
    private VenueService venueService;


    public List<Venue> getVenues() {
        return venueService.getVenues();
    }
}