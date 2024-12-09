package dh.cleancode.Lv5;

import java.util.List;

import static dh.cleancode.Lv5.SeatStatus.BOOKED;

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
            if (seat.isStatus() == BOOKED) {
                count++;
            }
        }
        System.out.println("Total booked seats: " + count);
    }
}
