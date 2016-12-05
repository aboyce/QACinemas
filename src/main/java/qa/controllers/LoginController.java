package qa.controllers;

import qa.persistence.webentities.CurrentSession;
import qa.persistence.webentities.LoginCredentials;
import qa.services.UserService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named("login")
@SessionScoped
public class LoginController implements Serializable {

    @Inject
    private CurrentSession currentSession;

    @Inject
    private UserService userService;

    private LoginCredentials credentials;

    @PostConstruct
    private void setup() {
        credentials = new LoginCredentials();
    }

    public LoginCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(LoginCredentials credentials) {
        this.credentials = credentials;
    }

    public String login() {
        if (credentials == null) {
            String error = "A logic error occurred, please try again.";
            credentials = new LoginCredentials(error, error);
            return null; // Return to the login page.
        }

        credentials = userService.login(credentials);
        if(credentials.getUser() == null) {
            return null; // Return to the login page.
        }

        currentSession.setUser(credentials.getUser());
        credentials = new LoginCredentials();
        return "index"; // They are now logged in, go to the index page.
    }

    public String logout() {
        currentSession.logout();
        credentials = new LoginCredentials();
        return "index"; // They are now logged in, go to the index page.
    }
}
