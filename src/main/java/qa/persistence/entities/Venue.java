package qa.persistence.entities;

import java.util.List;

public class Venue {

    private Integer id;
    private String name;
    private String location;
    private int seatRows;
    private int seatNumbers;
    private List<List<Seat>> seats;

    public Venue(Integer id, String name, String location, int seatRows, int seatNumbers, List<List<Seat>> seats) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.seatRows = seatRows;
        this.seatNumbers = seatNumbers;
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getSeatRows() {
        return seatRows;
    }

    public int getSeatNumbers() {
        return seatNumbers;
    }

    public List<List<Seat>> getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "" + this.name + " at " + this.location;
    }
}