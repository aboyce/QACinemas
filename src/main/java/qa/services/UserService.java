package qa.services;


import qa.Helpers.HashingHelper;
import qa.persistence.entities.User;
import qa.persistence.repositories.UserRepository;
import qa.persistence.webentities.LoginCredentials;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService {

    @Inject
    private UserRepository userRepository;

    public User login(LoginCredentials credentials) {

        if (credentials == null) {
            return null;
        }

        if (credentials.getUsername() == null || credentials.getUsername().equals("")) {
            credentials.setUsernameError("Username Required");
            credentials.setPasswordError(null);
            credentials.setPassword("");
            return null;
        } else if (credentials.getPassword() == null || credentials.getPassword().equals("")) {
            credentials.setUsernameError(null);
            credentials.setPasswordError("Password Required");
            credentials.setPassword("");
            return null;
        }

        credentials.setPasswordHash(HashingHelper.hashPassword(credentials.getPassword()));
        credentials.setPassword("");

        User user = userRepository.login(credentials.getUsername(), credentials.getPasswordHash());

        if (user == null) {
            credentials.setUsernameError("Could not find User, please check credentials");
            credentials.setPasswordError("Could not find User, please check credentials");
            credentials.setPassword("");
            return null;
        }

        return user;
    }

    public User register(User user) {

        if(user == null){
            return null;
        }


        return user;
    }

    public boolean add(User user){
        return false;
    }
}
