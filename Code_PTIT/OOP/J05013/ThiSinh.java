package J05013;

public class ThiSinh implements Comparable<ThiSinh>{
    private String id, name;
    private float lt, th;
    static int cnt = 1;

    public ThiSinh(String name, float lt, float th) {
        this.id = String.format("TS%02d", cnt);
        ++cnt;
        this.name = name;
        this.lt = lt;
        this.th = th;
    }

    public float getPoint() {
        return (this.lt + this.th) / 2;
    }

    public String getStatus() {
        float diem = this.getPoint();
        if(diem < 5) return "TRUOT";
        else if(diem < 8) return "CAN NHAC";
        else if(diem < 9.5) return "DAT";
        else return "XUAT SAC";
    }

    @Override
    public int compareTo(ThiSinh other) {
        if(this.getPoint() > other.getPoint()) return -1;
        else return 1;
    }

    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.2f", this.getPoint()) + " " + this.getStatus();
    }
}
