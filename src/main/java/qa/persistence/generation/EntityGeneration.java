package qa.persistence.generation;

import qa.Helpers.DateHelper;
import qa.persistence.entities.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EntityGeneration {

    private static List<List<Seat>> getSampleSeats(int seatRows, int seatNumbers) {
        List<List<Seat>> seats = new ArrayList<List<Seat>>();

        for (int currentRow = 0; currentRow < seatRows; currentRow++) {
            seats.add(new ArrayList<Seat>());
            for (int currentNumber = 0; currentNumber < seatNumbers; currentNumber++) {
                seats.get(currentRow).add(new Seat(null, currentRow, currentNumber, null));
            }
        }
        return seats;
    }

    public static List<User> getSampleUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(0, "Admin", "Test", "admin", "test", "a.test@email.com", DateHelper.getDateFromString("01/01/2000")));
        users.add(new User(1, "Terry", "Grange", "terry_grange", "test", "t.grange@email.com", DateHelper.getDateFromString("25/11/1969")));
        users.add(new User(2, "Fran", "Levels", "fran_levels", "test", "f.levels@email.com", DateHelper.getDateFromString("13/04/1973")));
        users.add(new User(3, "John", "Smith", "john_smith", "test", "j.smith@email.com", DateHelper.getDateFromString("05/08/1964")));
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
        films.add(new Film(12, "Episode VI - Return of the Jedi", "Richard Marquand", "https://images-na.ssl-images-amazon.com/images/M/MV5BODllZjg2YjUtNWEzNy00ZGY2LTgyZmQtYTkxNDYyOWM3OTUyXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg", 131, Year.parse("1983")));
        films.add(new Film(13, "Toy Story 3", "Lee Unkrich", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTgxOTY4Mjc0MF5BMl5BanBnXkFtZTcwNTA4MDQyMw@@._V1_UY268_CR3,0,182,268_AL_.jpg", 123, Year.parse("2010")));
        films.add(new Film(14, "Die Hard", "John McTiernan", "https://images-na.ssl-images-amazon.com/images/M/MV5BMzNmY2IwYzAtNDQ1NC00MmI4LThkOTgtZmVhYmExOTVhMWRkXkEyXkFqcGdeQXVyMTk5NDA3Nw@@._V1_UX182_CR0,0,182,268_AL_.jpg", 131, Year.parse("1988")));
        return films;
    }

    public static List<Rating> getSampleRatings(List<Film> films) {
        int idCounter = 0;
        User ratingProvider = new User(null, "Susan", "Smith", "dave", "test", "dave@email.com", DateHelper.getDateFromString("16/05/1968"));
        List<Rating> ratings = new ArrayList<Rating>();
        for (Film film : films) {
            ratings.add(new Rating(idCounter++, film, ratingProvider, 3, "Giant expectations may lead to tiny disappointments in this two-hander that's slow in parts. But it still offers magic and visual delights, and the final act is a treat.", DateHelper.getDateFromString("24/11/16")));
            ratings.add(new Rating(idCounter++, film, ratingProvider, 4, "Too hard to follow, but brain-numbing fun makes it a slightly memorable experience.", DateHelper.getDateFromString("26/11/16")));
            ratings.add(new Rating(idCounter++, film, ratingProvider, 5, "A supremely well-crafted film.", DateHelper.getDateFromString("15/11/16")));
            ratings.add(new Rating(idCounter++, film, ratingProvider, 5, "It's visually resourceful and honest in how it sets up and delivers on it's story.", DateHelper.getDateFromString("5/12/16")));
            ratings.add(new Rating(idCounter++, film, ratingProvider, 1, "How do I go about a refund?", DateHelper.getDateFromString("24/11/16")));
            ratings.add(new Rating(idCounter++, film, ratingProvider, 4, "Too hard to follow, but brain-numbing fun makes it a slightly memorable experience.", DateHelper.getDateFromString("26/11/16")));
            ratings.add(new Rating(idCounter++, film, ratingProvider, 2, "So disappointed, but was 2-for-1.", DateHelper.getDateFromString("15/11/16")));
            ratings.add(new Rating(idCounter++, film, ratingProvider, 5, "It's visually resourceful and honest in how it sets up and delivers on it's story.", DateHelper.getDateFromString("5/12/16")));
        }
        return ratings;
    }

    public static List<Viewing> getSampleViewings(List<Film> films, List<Venue> venues) {

        ThreadLocalRandom random = ThreadLocalRandom.current();
        List<Viewing> viewings = new ArrayList<Viewing>();
        viewings.add(new Viewing(0, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("12/01/17")));
        viewings.add(new Viewing(1, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("13/01/17")));
        viewings.add(new Viewing(2, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("14/01/17")));
        viewings.add(new Viewing(3, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("15/01/17")));
        viewings.add(new Viewing(4, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("16/01/17")));
        viewings.add(new Viewing(5, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("16/01/17")));
        viewings.add(new Viewing(6, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("16/01/17")));
        viewings.add(new Viewing(7, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("17/01/17")));
        viewings.add(new Viewing(8, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("18/01/17")));
        viewings.add(new Viewing(9, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("19/01/17")));
        viewings.add(new Viewing(10, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("20/01/17")));
        viewings.add(new Viewing(11, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("20/01/17")));
        viewings.add(new Viewing(12, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("20/01/17")));
        viewings.add(new Viewing(13, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("22/01/17")));
        viewings.add(new Viewing(14, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("23/01/17")));
        viewings.add(new Viewing(15, films.get(random.nextInt(0, films.size())), venues.get(random.nextInt(0, venues.size())), DateHelper.getDateFromString("25/01/17")));
        return viewings;
    }

    public static List<Venue> getSampleVenues() {
        List<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(0, "Screen 1", "ODEON, Manchester", 10, 15, getSampleSeats(10, 15)));
        venues.add(new Venue(1, "Screen 2", "ODEON, Manchester", 10, 15, getSampleSeats(10, 15)));
        venues.add(new Venue(2, "Screen 3", "ODEON, Manchester", 10, 15, getSampleSeats(10, 15)));
        venues.add(new Venue(3, "Main Screen", "VUE, Lincoln", 10, 15, getSampleSeats(10, 15)));
        return venues;
    }
}
