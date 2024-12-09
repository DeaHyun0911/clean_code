package dh.cleancode.Lv2;

public class Seat {
    String seatNumber;
    String status;

    public Seat(String seatNumber, String status) {
        this.seatNumber = seatNumber;
        this.status = status;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
