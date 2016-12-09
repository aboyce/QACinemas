package qa.persistence.repositories.offline;

import qa.persistence.entities.User;
import qa.persistence.repositories.UserRepository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;

@Stateless
@Default
public class UserRepositoryOffline implements UserRepository {

    @Inject
    private DatabaseOffline db;

    @Override
    public boolean add(User user) {
        if (user != null) {
            return db.getUsers().add(user);
        }
        return false;
    }

    @Override
    public User getUserById(Integer id) {
        for (User user : db.getUsers()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
        return db.getUsers();
    }

    @Override
    public User login(String username, String passwordHash) {
        for (User user : db.getUsers()) {
            if (user.getUsername().equals(username) && user.getPasswordHash().equals(passwordHash)) {
                return user;
            }
        }
        return null;
    }
}
