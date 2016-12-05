package qa.persistence.repositories;

import qa.persistence.entities.User;

import java.util.List;

public interface UserRepository {

    User getUserById(Integer id);
    List<User> getUsers();

    /* LOGIN FUNCTIONALITY */
    User login(String username, String passwordHash);
}
