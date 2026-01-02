package J05015;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Racer implements Comparable<Racer>{
    public static DateTimeFormatter HM = DateTimeFormatter.ofPattern("H:m");
    private String id, name, city;
    LocalTime end;

    public Racer(String id, String name, String city, LocalTime end) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.end = end;
    }

    public int compareTo(Racer other) {
        if(this.end.isBefore(other.end)) return -1;
        else return 1;
    }

    public long Speed() {
        long Minutes = ChronoUnit.MINUTES.between(LocalTime.parse("6:00", HM), this.end);
        double hours = (double) Minutes / 60;
        return Math.round(120.0 / hours);
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.city + " " + this.Speed() + " Km/h";
    }
}
