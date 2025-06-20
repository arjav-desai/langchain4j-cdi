package dev.langchain4j.cdi.example.booking;

public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(String bookingNumber) {
        super("Booking " + bookingNumber + " not found");
    }
}