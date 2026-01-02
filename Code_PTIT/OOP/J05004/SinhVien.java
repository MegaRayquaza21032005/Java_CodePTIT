package J05004;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SinhVien implements Comparable<SinhVien> {
    private String name, id, lop;
    private float gpa;
    private LocalDate dob;
    private DateTimeFormatter DMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static int cnt = 1;

    public SinhVien(String name, String lop, LocalDate dob, float gpa) {
        this.name = name;
        this.id = String.format("B20DCCN%03d", cnt);
        ++cnt;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }
    @Override
    public int compareTo(SinhVien other) {
        if(this.gpa != other.gpa) {
            if(this.gpa > other.gpa) return -1;
            else return 1;
        }
        else {
            return this.id.compareTo(other.id);
        }
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + this.dob.format(DMY) + " " + String.format("%.2f", this.gpa);
    }
}
