package test;

import java.util.Comparator;

public class MatHang implements Comparable<MatHang>{
    private String id, name, dvi;
    private int giamua, giaban;
    static int cnt = 1;

    public MatHang(String name, String dvi, int giamua, int giaban) {
        this.id = String.format("MH%03d", cnt);
        cnt += 1;
        this.name = name;
        this.dvi = dvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    @Override
    public int compareTo(MatHang o) {
        int loinhuan1 = this.giaban - this.giamua;
        int loinhuan2 = o.giaban - o.giamua;
        if(loinhuan1 != loinhuan2) return loinhuan2 - loinhuan1;
        else return this.id.compareTo(o.id);
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.dvi + " " + this.giamua + " " + this.giaban + " " + (this.giaban - this.giamua);
    }
}

