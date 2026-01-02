package DongPhuc;

public class SinhVien {
    private String id, name, lop, email, sdt, gt, size;

    public SinhVien(String id, String name, String lop, String email, String sdt, String gt) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gt = gt;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGt() {
        return gt;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + this.email + " " + this.sdt;
    }
}
