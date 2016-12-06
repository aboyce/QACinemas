package qa.persistence.entities;

import java.util.Date;

public class User {

    private Integer id;
    private String forename;
    private String surname;
    private String username;
    private String passwordHash;
    private String email;
    private Date dateOfBirth;

    public User() {
    }

    public User(Integer id, String firstname, String lastname, String username, String passwordHash, String email, Date dateOfBirth) {
        this.id = id;
        this.forename = firstname;
        this.surname = lastname;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
