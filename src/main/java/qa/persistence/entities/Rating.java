package qa.persistence.entities;

import java.util.Date;

public class Rating {

    private Integer id;
    private Film film;
    private User user;
    private int rating;
    private String description;
    private Date date;

    public Rating() {
    }

    public Rating(Integer id, Film film, User user, int rating, String description, Date date) {
        this.id = id;
        this.film = film;
        this.user = user;
        this.rating = rating;
        this.description = description;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public User getUser() {
        return user;
    }

    public int getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}
