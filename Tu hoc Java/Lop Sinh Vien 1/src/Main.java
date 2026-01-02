import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();
        StudentManager studentManager = new StudentManager(students);
        for(int i = 1; i <= n; ++i) {
            studentManager.inputStudent(i);
        }
    }
}