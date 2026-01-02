import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Student implements Comparable<Student>{
    private String name;
    private Date start;
    private Date end;
    private long minutes;

    public Student(String name, String start, String end) throws Exception {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.start = sdf.parse(start);
        this.end = sdf.parse(end);
        this.minutes = (this.end.getTime() - this.start.getTime()) / (1000 * 60);
    }

    @Override
    public int compareTo(Student o) {
        if(this.minutes != o.minutes) return Long.compare(o.minutes, this.minutes);
        return this.name.compareTo(o.name);
    }

    public String toString() {
        return this.name + " " + this.minutes;
    }
}
