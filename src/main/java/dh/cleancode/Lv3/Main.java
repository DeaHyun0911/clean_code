package dh.cleancode.Lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Seat> seats = new ArrayList<>();
        seats.add(new Seat("A1", "AVAILABLE"));
        seats.add(new Seat("A2", "AVAILABLE"));
        seats.add(new Seat("A3", "AVAILABLE"));


        List<String> seats2 = List.of("A2", "A3", "A1", "A4");

        for (String seat2 : seats2) {
            bookSeat(seats, seat2);
        }

        countBookedSeats(seats);

    }

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