package J05011;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class Player implements Comparable<Player> {
    private String id, name;
    LocalTime checkin, checkout;

    public Player(String id, String name, LocalTime checkin, LocalTime checkout) {
        this.id = id;
        this.name = name;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int compareTo(Player other) {
        long thisPlayerMinutes = ChronoUnit.MINUTES.between(this.checkin, this.checkout);
        long otherPlayerMinutes = ChronoUnit.MINUTES.between(other.checkin, other.checkout);
        if(thisPlayerMinutes > otherPlayerMinutes) return -1;
        else return 1;
    }

    public String toString() {
        long h = ChronoUnit.HOURS.between(this.checkin, this.checkout);
        long m = ChronoUnit.MINUTES.between(this.checkin, this.checkout);
        return this.id + " " + this.name + " " + h + " gio " + (m - 60 * h) + " phut";
    }
}
