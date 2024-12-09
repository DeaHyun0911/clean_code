package dh.cleancode.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookingManager bookingManager = new BookingManager();

        List<Seat> seats = new ArrayList<>();
        seats.add(new Seat("A1", "AVAILABLE"));
        seats.add(new Seat("A2", "AVAILABLE"));
        seats.add(new Seat("A3", "AVAILABLE"));

        List<String> seats2 = List.of("A2", "A3", "A1", "A4");

        for (String seat2 : seats2) {
            BookingManager.bookSeat(seats, seat2);
        }

        BookingManager.countBookedSeats(seats);
    }


}