package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String band;
    private LocalDateTime startingTime;
    private int price;

    public Ticket(String band, LocalDateTime startingTime, int price) {
        this.band = band;
        this.startingTime = startingTime;
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getStartingTime() {
        return startingTime;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime entryTime() {
        return startingTime.toLocalTime().minusHours(1);
    }
}
