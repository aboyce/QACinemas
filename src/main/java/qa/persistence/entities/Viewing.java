package qa.persistence.entities;

import java.util.Date;

public class Viewing {

    private Integer id;
    private Film film;
    private Venue venue;
    private Date date;

    public Viewing() {
    }

    public Viewing(Integer id, Film film, Venue venue, Date date) {
        this.id = id;
        this.film = film;
        this.venue = venue;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public Venue getVenue() {
        return venue;
    }

    public Date getDate() {
        return date;
    }
}
