package qa.persistence.entities;

import java.util.Date;
import java.util.List;

public class Viewing {

    private Integer id;
    private Film film;
    private Date date;
    private List<Seat> seats;

    public Viewing() {}

    public Viewing(Integer id, Film film, Date date, List<Seat> seats) {
        this.id = id;
        this.film = film;
        this.date = date;
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public Date getDate() {
        return date;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
