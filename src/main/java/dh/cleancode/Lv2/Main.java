package dh.cleancode.Lv2;

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

        for (int i = 0; i < seats.size(); i++) {
            Seat seat = seats.get(i);
            if(seat.getSeatNumber().equals(seat2)) {
                // 예약하려는 좌석 상태가 BOOKED 면 예약 불가
                if (seat.isStatus().equals("BOOKED")) {
                    System.out.println("Seat " + seat2 + " is already booked.");
                    book = true;
                    break;
                } else {
                    seats.set(i, new Seat(seat2, "BOOKED"));
                    System.out.println("Seat " + seat2 + " has been successfully booked.");
                    book = true;
                    break;
                }
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