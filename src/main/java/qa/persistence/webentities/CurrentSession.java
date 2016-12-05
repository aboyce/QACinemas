package qa.persistence.webentities;

import qa.persistence.entities.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("current_session")
@SessionScoped
public class CurrentSession implements Serializable {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    public void logout() {
        this.user = null;
    }
}
