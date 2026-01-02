package J05034;

public class SinhVien implements Comparable<SinhVien>{
    private String id, name, lop, email, company;
    private int stt;
    static int cnt = 1;

    public SinhVien(String id, String name, String lop, String email, String company) {
        this.stt = cnt;
        ++cnt;
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }
    @Override
    public int compareTo(SinhVien other) {
        if(this.name.compareTo(other.name) != 0) {
            return this.name.compareTo(other.name);
        }
        else return this.stt - other.stt;
    }

    public String toString() {
        return this.stt + " " + this.id + " " + this.name + " " + this.lop + " " + this.email + " " + this.company;
    }
}
