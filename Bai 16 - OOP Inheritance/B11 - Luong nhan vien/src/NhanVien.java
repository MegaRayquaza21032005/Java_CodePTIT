public class NhanVien {
    private String id, name, chucVu;
    private int luong, day;

    public NhanVien(String id, String name, String chucVu, int luong, int day) {
        this.id = id;
        this.name = name;
        this.chucVu = chucVu;
        this.luong = luong;
        this.day = day;
    }
    public long luongThang() {
        return 1L * this.luong * this.day;
    }
    public long getThuong() {
        long luong = this.luongThang();
        if(this.day >= 25) return (long) (0.2 * luong);
        else if(this.day >= 22) return (long) (0.1 * luong);
        else return 0L;
    }
    public long getPhuCap() {
        if(this.chucVu.equals("GD")) return 250000L;
        else if(this.chucVu.equals("PGD")) return 200000L;
        else if(this.chucVu.equals("TP")) return 180000L;
        else return 150000L;
    }
    public String toString() {
        return this.id + " " + this.name + " " + luongThang() + " " + getThuong() + " " + getPhuCap() + " " + (luongThang() + getThuong() + getPhuCap());
    }
}
