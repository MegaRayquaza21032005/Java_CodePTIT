package J05003;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SinhVien {
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

    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + this.dob.format(DMY) + " " + String.format("%.2f", this.gpa);
    }
}
