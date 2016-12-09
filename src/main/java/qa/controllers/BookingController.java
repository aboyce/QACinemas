package qa.controllers;

import qa.persistence.entities.Film;
import qa.persistence.webentities.CurrentSession;
import qa.persistence.webentities.Pages;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("booking")
@RequestScoped
public class BookingController {

    @Inject
    private CurrentSession currentSession;

    public String bookFilm(Film film) {
        currentSession.setSelectedFilm(film);
        return Pages.BOOKING;
    }

    public String getPanelColourForRating(Integer review) {
        if (review == null) {
            return "panel-default";
        } else if (review <= 2) {
            return "panel-danger";
        } else if (review > 2 && review <= 3) {
            return "panel-warning";
        } else if (review >= 4) {
            return "panel-success";
        }
        return "panel-default";
    }
}
