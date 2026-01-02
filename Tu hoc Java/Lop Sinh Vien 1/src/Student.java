public class Student {
    private String name, lop, birth;
    double gpa;
    String id;

    public Student(int id, String name, String lop, String birth, double gpa) {
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
        this.id = "B20DCCN" + String.format("%03d", id);
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + this.birth + " " + this.gpa;
    }
}