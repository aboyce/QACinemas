package qa.persistence.webentities;

import qa.persistence.entities.Film;
import qa.persistence.entities.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("current_session")
@SessionScoped
public class CurrentSession implements Serializable {

    /* -- LOGGED IN USER -- */

    private User user;

    public User getUser() {
        return user;
    }

    public void login(User user) {
        this.user = user;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    public String logout() {
        this.user = null;
        return Pages.INDEX;
    }

    /* -- SELECTED FILM -- */

    private Film selectedFilm;

    public boolean isFilmSelected() {
        return selectedFilm != null;
    }

    public Film getSelectedFilm() {
        return selectedFilm;
    }

    public void setSelectedFilm(Film selectedFilm) {
        this.selectedFilm = selectedFilm;
    }
}
