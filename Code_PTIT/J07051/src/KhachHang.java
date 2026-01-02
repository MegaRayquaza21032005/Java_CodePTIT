import java.time.*;
import java.time.temporal.ChronoUnit;


public class KhachHang {
    private String name, phong, id;
    private LocalDate start, end;
    private long phuphi;
    static int cnt = 1;

    public KhachHang(String name, String phong, LocalDate start, LocalDate end, int phuphi) {
        this.id = String.format("KH%02d", cnt);
        cnt++;
        this.name = name;
        this.phong = phong;
        this.start = start;
        this.end = end;
        this.phuphi = phuphi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public long getPhuphi() {
        return phuphi;
    }

    public void setPhuphi(int phuphi) {
        this.phuphi = phuphi;
    }

    public long tongChiPhi() {
        long cost = 0;
        if (this.phong.charAt(0) == '1') cost = 25;
        else if (this.phong.charAt(0) == '2') cost = 34;
        else if (this.phong.charAt(0) == '3') cost = 50;
        else if (this.phong.charAt(0) == '4') cost = 80;
        long days = ChronoUnit.DAYS.between(start, end) + 1;
        return days * cost + this.phuphi;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.phong + " " + (ChronoUnit.DAYS.between(start, end) + 1) + " " + this.tongChiPhi();
    }
}
