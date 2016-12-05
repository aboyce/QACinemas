package qa.persistence.generation;

import qa.persistence.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntityGeneration {

    private static final String DATE_FORMAT = "dd/MM/yyyy";

    private static Date getDateOfBirth(String dateString){
        if(dateString == null) { return null; }
        try {
            return new SimpleDateFormat(DATE_FORMAT).parse(dateString);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static List<User> getSampleUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(0, "Admin", "Test", "admin", "test", "a.test@email.com", getDateOfBirth("01/01/2000")));
        users.add(new User(1, "Terry", "Grange", "terry_grange", "test", "t.grange@email.com", getDateOfBirth("25/11/1969")));
        users.add(new User(2, "Fran", "Levels", "fran_levels", "test", "f.levels@email.com", getDateOfBirth("13/04/1973")));
        users.add(new User(3, "John", "Smith", "john_smith", "test", "j.smith@email.com", getDateOfBirth("05/08/1964")));
        return users;
    }

    public static List<Film> getSampleFilms() {
        List<Film> films = new ArrayList<Film>();
        films.add(new Film(0, "The Shawshank Redemption", "Frank Darabont", "https://images-na.ssl-images-amazon.com/images/M/MV5BODU4MjU4NjIwNl5BMl5BanBnXkFtZTgwMDU2MjEyMDE@._V1_UX182_CR0,0,182,268_AL_.jpg", 142, Year.parse("1994")));
        films.add(new Film(1, "The Godfather", "Francis Ford Coppola", "https://images-na.ssl-images-amazon.com/images/M/MV5BNTc0ZDk1YWItZDZiNi00NTdmLWE0MDctNTVhYTRhMDBmZjNjXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX182_CR0,0,182,268_AL_.jpg", 175, Year.parse("1972")));
        films.add(new Film(2, "The Dark Knight", "Christopher Nolan", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg", 152, Year.parse("2008")));
        films.add(new Film(3, "Pulp Fiction", "Quentin Tarantino", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTkxMTA5OTAzMl5BMl5BanBnXkFtZTgwNjA5MDc3NjE@._V1_UX182_CR0,0,182,268_AL_.jpg", 154, Year.parse("1994")));
        films.add(new Film(4, "Fight Club", "David Fincher", "https://images-na.ssl-images-amazon.com/images/M/MV5BMzc1YmU2ZjEtYWIwMC00ZjM3LWI0NTctMDVlNGQ3YmYwMzE5XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY268_CR3,0,182,268_AL_.jpg", 139, Year.parse("1972")));
        films.add(new Film(5, "Forrest Gump", "Robert Zemeckis", "https://images-na.ssl-images-amazon.com/images/M/MV5BYThjM2MwZGMtMzg3Ny00NGRkLWE4M2EtYTBiNWMzOTY0YTI4XkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UY268_CR10,0,182,268_AL_.jpg", 142, Year.parse("1994")));
        films.add(new Film(6, "The Matrix", "The Wachowski Brothers", "https://images-na.ssl-images-amazon.com/images/M/MV5BMDMyMmQ5YzgtYWMxOC00OTU0LWIwZjEtZWUwYTY5MjVkZjhhXkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UY268_CR6,0,182,268_AL_.jpg", 136, Year.parse("1999")));
        films.add(new Film(7, "Saving Private Ryan", "Steven Spielberg", "https://images-na.ssl-images-amazon.com/images/M/MV5BZjhkMDM4MWItZTVjOC00ZDRhLThmYTAtM2I5NzBmNmNlMzI1XkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UY268_CR0,0,182,268_AL_.jpg", 169, Year.parse("1998")));
        films.add(new Film(8, "Terminator 2: Judgment Day", "James Cameron", "https://images-na.ssl-images-amazon.com/images/M/MV5BZDM2YjYwYWMtMWZlNi00ZDQxLWExMDctMDAzNzQ0OTkzZjljXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg", 137, Year.parse("1991")));
        films.add(new Film(9, "Back to the Future", "Robert Zemeckis", "https://images-na.ssl-images-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg", 136, Year.parse("1985")));
        films.add(new Film(10, "Gladiator", "Ridley Scott", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTgwMzQzNTQ1Ml5BMl5BanBnXkFtZTgwMDY2NTYxMTE@._V1_UX182_CR0,0,182,268_AL_.jpg", 155, Year.parse("2000")));
        films.add(new Film(11, "Django Unchained", "Quentin Tarantino", "https://images-na.ssl-images-amazon.com/images/M/MV5BMjIyNTQ5NjQ1OV5BMl5BanBnXkFtZTcwODg1MDU4OA@@._V1_UX182_CR0,0,182,268_AL_.jpg", 165, Year.parse("2012")));
        films.add(new Film(12, "Star Wars: Episode VI - Return of the Jedi", "Richard Marquand", "https://images-na.ssl-images-amazon.com/images/M/MV5BODllZjg2YjUtNWEzNy00ZGY2LTgyZmQtYTkxNDYyOWM3OTUyXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg", 131, Year.parse("1983")));
        films.add(new Film(13, "Toy Story 3", "Lee Unkrich", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTgxOTY4Mjc0MF5BMl5BanBnXkFtZTcwNTA4MDQyMw@@._V1_UY268_CR3,0,182,268_AL_.jpg", 123, Year.parse("2010")));
        films.add(new Film(14, "Die Hard", "John McTiernan", "https://images-na.ssl-images-amazon.com/images/M/MV5BMzNmY2IwYzAtNDQ1NC00MmI4LThkOTgtZmVhYmExOTVhMWRkXkEyXkFqcGdeQXVyMTk5NDA3Nw@@._V1_UX182_CR0,0,182,268_AL_.jpg", 131, Year.parse("1988")));
        return films;
    }

    public static List<Rating> getSampleRatings() {
        List<Rating> ratings = new ArrayList<Rating>();
        return ratings;
    }

    public static List<Viewing> getSampleViewings() {
        List<Viewing> viewings = new ArrayList<Viewing>();
        return viewings;
    }

    public static List<Seat> getSampleSeats() {
        List<Seat> seats = new ArrayList<Seat>();
        return seats;
    }
}
