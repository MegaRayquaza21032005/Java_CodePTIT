public class Pupil extends Student {
    private String fatherName;
    public Pupil(String lop, double gpa, String name, String birth, String fatherName) {
        super(lop, gpa, name, birth);
        this.fatherName = fatherName;
    }
}
