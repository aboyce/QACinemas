package qa.persistence.repositories;

import qa.persistence.entities.User;

import java.util.List;

public interface UserRepository {

    /**
     * Persist a User.
     * @param user the User to persist.
     * @return the result of adding the User.
     */
    boolean add(User user);

    /**
     * Retrieve a User from storage by it'd Id.
     * @param id the Id to match to the User.
     * @return the retrieved User, or null if not successful.
     */
    User getUserById(Integer id);

    /**
     * Retrieve all Users from storage.
     * @return the List of Users retrieved.
     */
    List<User> getUsers();

    /* LOGIN FUNCTIONALITY */

    /**
     * Will attempt to identify a User by the Username and Password Hash, and retrieve the User.
     * @param username the Username to compare.
     * @param passwordHash the Password to compare.
     * @return the matching User. or null if not successful.
     */
    User login(String username, String passwordHash);
}
