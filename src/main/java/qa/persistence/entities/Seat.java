package qa.persistence.entities;


public class Seat {

    private Integer id;
    private int seatRow;
    private int seatNumber;
    private User bookedUser;

    public Seat(Integer id, int seatRow, int seatNumber, User bookedUser) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.bookedUser = bookedUser;
    }

    public Integer getId() {
        return id;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public User getBookedUser() {
        return bookedUser;
    }
}
