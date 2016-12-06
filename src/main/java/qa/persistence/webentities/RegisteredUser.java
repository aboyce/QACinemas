package qa.persistence.webentities;


import qa.Helpers.DateHelper;
import qa.persistence.entities.User;

import java.util.Date;

public class RegisteredUser {

    private User user;
    private String userDateOfBirthString;
    private String errorMessage;

    public RegisteredUser() {
        this.user = new User();
        this.errorMessage = null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserDateOfBirthString() {
        return userDateOfBirthString;
    }

    public void setUserDateOfBirthString(String userDateOfBirthString) {
        this.userDateOfBirthString = userDateOfBirthString;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Will check that the User has been populated, and update the errorMessage message.
     * @return if the User has been populated or not.
     */
    public boolean isUserValid() {

        boolean error = false;
        errorMessage = "Please check over the following issue(s) and try again: ";

        if (user == null) {
            errorMessage = "Logic error, please load the page and try again.";
            return false;
        }

        if (user.getForename() == null || user.getForename().equals("")) {
            error = true;
            errorMessage += " Please enter a forename.";
        }
        if (user.getSurname() == null || user.getSurname().equals("")) {
            error = true;
            errorMessage += " Please enter a surname.";
        }
        if (user.getUsername() == null || user.getUsername().equals("")) {
            error = true;
            errorMessage += " Please enter a username.";
        }
        if (user.getEmail() == null || user.getEmail().equals("")) {
            error = true;
            errorMessage += " Please enter an email address.";
        }
        user.setDateOfBirth(DateHelper.getDateOfBirth(userDateOfBirthString));
        if (user.getDateOfBirth() == null || user.getDateOfBirth().before(new Date())) {
            error = true;
            errorMessage += " Please enter a date of birth, and check it is valid.";
        }
        if (user.getPasswordHash() == null || user.getPasswordHash().equals("")) {
            error = true;
            errorMessage += " Please enter a password.";
        }

        if (error){
            return false; // The User is not valid.
        }

        errorMessage = null;
        return true;
    }
}
