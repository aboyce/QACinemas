package qa.persistence.entities;

import java.time.Year;
import java.util.List;

public class Film {

    private Integer id;
    private String title;
    private String director;
    private int duration;
    private Year releaseYear;

    public Film() {}

    public Film(Integer id, String title, String director, int duration, Year releaseYear) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }
}
