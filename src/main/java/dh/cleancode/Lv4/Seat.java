package dh.cleancode.Lv4;

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

    public void book() {
        if(this.status.equals("BOOKED")) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return;
        }

        this.status = "BOOKED";
        System.out.println("Seat " + seatNumber + " has been successfully booked.");

    }
}
