package dh.cleancode.Lv4;

import java.util.List;

public class BookingManager {

    public static void bookSeat(List<Seat> seats, String seat2) {
        boolean book = false;

        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seat2)) {
                seat.book();
                book = true;
                break;
            }
        }

        if (!book) {
            System.out.println("Seat " + seat2 + " does not exist.");
        }
    }


    public static void countBookedSeats(List<Seat> seats) {
        int count = 0;
        for (Seat seat : seats) {
            if (seat.isStatus().equals("BOOKED")) {
                count++;
            }
        }
        System.out.println("Total booked seats: " + count);
    }
}
