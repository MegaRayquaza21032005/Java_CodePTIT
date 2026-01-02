import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        double point1 = sc.nextDouble();
        double point2 = sc.nextDouble();
        double point3 = sc.nextDouble();
        Student x = new Student(name, birth, point1, point2, point3);
        //Student x = new Student("Dat", "21/03", 10.0, 9.5, 9.25);
        x.info();
    }
}