package qa.persistence.repositories;

import qa.persistence.entities.User;

import java.util.List;

public interface UserRepository {

    public User getUserById(Integer id);
    public List<User> getUsers();
}
