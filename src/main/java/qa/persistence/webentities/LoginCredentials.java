package qa.persistence.webentities;

import qa.persistence.entities.User;

public class LoginCredentials {

    private String username = "";
    private String password = "";
    private String passwordHash = "";
    private String usernameError;
    private String passwordError;
    private User user;

    /**
     * Create an empty LoginCredentials.
     */
    public LoginCredentials() { }

    /**
     * Create LoginCredentials with error messages.
     * @param usernameError the error for the Username.
     * @param passwordError the error for the Password.
     */
    public LoginCredentials(String usernameError, String passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
