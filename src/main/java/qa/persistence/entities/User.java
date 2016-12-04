package qa.persistence.entities;

import java.util.Date;

public class User {

    private Integer id;
    private String forename;
    private String surname;
    private String username;
    private String email;
    private Date dateOfBirth;

    public User() {}

    public User(Integer id, String firstname, String lastname, String username, String email, Date dateOfBirth) {
        this.id = id;
        this.forename = firstname;
        this.surname = lastname;
        this.username = username;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
