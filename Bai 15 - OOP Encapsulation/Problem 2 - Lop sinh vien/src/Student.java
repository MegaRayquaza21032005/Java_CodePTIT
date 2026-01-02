public class Student {
    private String name, birth;
    double point1, point2, point3;

    Student(String name, String birth, double point1, double point2, double point3) {
        this.name = name;
        this.birth = birth;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double sum()
    {
        return this.point1 + this.point2 + this.point3;
    }
    public void info()
    {
        System.out.println(this.name + " " + this.birth + " " + sum());
    }
}
