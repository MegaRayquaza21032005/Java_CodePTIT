package danhsachsinhvien1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class SinhVien implements Serializable {
    private String id, name, lop;
    LocalDate date;
    float gpa;
    static int cnt = 1;
    DateTimeFormatter DMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter inp = DateTimeFormatter.ofPattern("d/M/yyyy");

    public SinhVien(String name, String lop, String date, float gpa) {
        this.id = String.format("B20DCCN%03d", cnt);
        ++cnt;
        this.name = name;
        this.lop = lop;
        this.date = LocalDate.parse(date, inp);
        this.gpa = gpa;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + this.date.format(DMY) + " " + String.format("%.2f", this.gpa);
    }
}
