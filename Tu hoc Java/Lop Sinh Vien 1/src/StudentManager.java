import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public String chuanhoa(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        while(sb.length() < 10) sb.insert(6, '0');
        return sb.toString();
    }
    public void inputStudent(int idx) {
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String birth = sc.nextLine();
        birth = chuanhoa(birth);
        double gpa = sc.nextDouble();
        sc.nextLine();
        Student stu = new Student(idx, name, lop, birth, gpa);
        students.add(stu);
    }
}
