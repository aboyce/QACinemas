package qa.controllers;

import qa.Helpers.HashingHelper;
import qa.persistence.entities.User;
import qa.persistence.webentities.CurrentSession;
import qa.persistence.webentities.LoginCredentials;
import qa.persistence.webentities.Pages;
import qa.persistence.webentities.RegisteredUser;
import qa.services.UserService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named("account")
@SessionScoped
public class AccountController implements Serializable {

    @Inject
    private CurrentSession currentSession;

    @Inject
    private UserService userService;

    private LoginCredentials credentials;
    private RegisteredUser registeredUser;

    @PostConstruct
    private void setup() {
        credentials = new LoginCredentials();
        registeredUser = new RegisteredUser();
    }

    public LoginCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(LoginCredentials credentials) {
        this.credentials = credentials;
    }

    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }

    public String register() {
        if(registeredUser == null) {
            registeredUser = new RegisteredUser(); // This shouldn't happen.
            return Pages.REGISTER; // Send them to register to reload the page.
        }

        registeredUser.getUser().setPasswordHash(HashingHelper.hashPassword(registeredUser.getUser().getPasswordHash()));

        if (!registeredUser.isUserValid()) {
            return Pages.CURRENT; // The User is not valid, return them back to sort it out.
        }

        userService.add(registeredUser.getUser()); // Add the User to storage.
        currentSession.login(registeredUser.getUser()); // Log them in.
        registeredUser = new RegisteredUser(); // Clean up for next time.
        return Pages.INDEX; // They are now logged in, go to the index page.
    }

    public String login() {
        if (credentials == null) {
            String error = "A logic error occurred, please try again.";
            credentials = new LoginCredentials(error, error);
            return Pages.CURRENT; // Return to the login page.
        }

        User user = userService.login(credentials);
        if(user == null) {
            return Pages.CURRENT; // Return to the login page.
        }

        currentSession.login(user);
        credentials = new LoginCredentials();
        return Pages.INDEX; // They are now logged in, go to the index page.
    }

    public String logout() {
        currentSession.logout();
        credentials = new LoginCredentials();
        return Pages.INDEX; // They are now logged in, go to the index page.
    }
}
