package dh.cleancode.Lv5;

import static dh.cleancode.Lv5.SeatStatus.BOOKED;

public class Seat {
    String seatNumber;
    SeatStatus status;

    public Seat(String seatNumber, SeatStatus status) {
        this.seatNumber = seatNumber;
        this.status = status;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public SeatStatus isStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    public void book() {
        if(this.status == BOOKED) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return;
        }

        this.status = BOOKED;
        System.out.println("Seat " + seatNumber + " has been successfully booked.");

    }
}
