import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Phim implements Comparable<Phim>{
    private String type, name, id;
    private int num_eps;
    private Date day;

    public Phim(int id, String type, String day, String name, int num_eps) throws Exception {
        this.type = type;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.day = sdf.parse(day);
        this.name = name;
        this.num_eps = num_eps;
        this.id = "P";
        if(id < 10) this.id = this.id + "00" + id;
        else if(id < 100) this.id = this.id + "0" + id;
        else this.id += id;
    }
    @Override
    public int compareTo(Phim o) {
        if(this.day.compareTo(o.day) != 0) return this.day.compareTo(o.day);
        else if(this.name.compareTo(o.name) != 0) return this.name.compareTo(o.name);
        return o.num_eps - this.num_eps;
    }
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return this.id + " " + this.type + " " + sdf.format(this.day) + " " + this.name + " " + this.num_eps;
    }
}
