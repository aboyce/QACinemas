package qa.services;


import qa.persistence.entities.User;
import qa.persistence.repositories.UserRepository;
import qa.persistence.webentities.LoginCredentials;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService {

    @Inject
    private UserRepository userRepository;

    @Inject
    private HashingService hashingService;

    public LoginCredentials login(LoginCredentials credentials) {

        if (credentials == null) {
            return null;
        }

        if (credentials.getUsername() == null || credentials.getUsername().equals("")) {
            credentials.setUsernameError("Username Required");
            credentials.setPasswordError(null);
            credentials.setPassword("");
            return credentials;
        } else if (credentials.getPassword() == null || credentials.getPassword().equals("")) {
            credentials.setUsernameError(null);
            credentials.setPasswordError("Password Required");
            credentials.setPassword("");
            return credentials;
        }

        credentials.setPasswordHash(hashingService.hashPassword(credentials.getPassword()));
        credentials.setPassword("");

        User user = userRepository.login(credentials.getUsername(), credentials.getPasswordHash());

        if (user == null) {
            credentials.setUsernameError("Could not find User, please check credentials");
            credentials.setPasswordError("Could not find User, please check credentials");
            credentials.setPassword("");
            return credentials;
        }

        credentials.setUser(user);
        return credentials;
    }
}
