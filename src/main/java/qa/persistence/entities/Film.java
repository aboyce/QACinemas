package qa.persistence.entities;

import java.time.Year;

public class Film {

    private Integer id;
    private String title;
    private String director;
    private String imageUrl;
    private int duration;
    private Year releaseYear;

    public Film() {
    }

    public Film(Integer id, String title, String director, String imageUrl, int duration, Year releaseYear) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public int getDuration() {
        return duration;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }
}
