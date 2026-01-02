package J05021;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, lop, email;

    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public int compareTo(SinhVien other) {
        return this.id.compareTo(other.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + this.email;
    }
}
