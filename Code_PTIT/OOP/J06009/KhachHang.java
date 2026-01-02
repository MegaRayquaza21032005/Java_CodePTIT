package J06009;

public class KhachHang {
    private String id, name, gt, dob, adr;

    public KhachHang(String id, String name, String gt, String dob, String adr) {
        this.id = id;
        this.name = name;
        this.gt = gt;
        this.dob = dob;
        this.adr = adr;
    }

    public String toString() {
        return this.name + " " + this.adr + " ";
    }
}
