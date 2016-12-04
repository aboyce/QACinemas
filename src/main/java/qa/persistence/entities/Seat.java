package qa.persistence.entities;


public class Seat {

    private Integer id;
    private int seatNumber;
    private char seatRow;
    private User bookedUser;

    public Seat(Integer id, int seatNumber, char seatRow, User bookedUser) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.bookedUser = bookedUser;
    }

    public Integer getId() {
        return id;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public char getSeatRow() {
        return seatRow;
    }

    public User getBookedUser() {
        return bookedUser;
    }
}
