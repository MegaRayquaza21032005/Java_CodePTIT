package J06009;

public class MatHang {
    private String id, name, dvi;
    private long giamua, giaban;

    public MatHang(String id, String name, String dvi, long giamua, long giaban) {
        this.id = id;
        this.name = name;
        this.dvi = dvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public long getGiamua() {
        return giamua;
    }

    public long getGiaban() {
        return giaban;
    }

    public String toString() {
        return this.name + " " + this.dvi + " " + this.giamua + " " + this.giaban + " ";
    }
}
