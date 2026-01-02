public class Student extends Person{
    private String lop;
    private double gpa;
//    public Student(String name, String birth) {
//        super(name, birth);
//    }
    Student(String lop, double gpa, String name, String birth) {
        super(name, birth); // gọi constructor của lớp cha để khởi tạo các attribute thuộc lớp cha
        this.lop = lop;
        this.gpa = gpa;
    }

    // khi lớp cha và lớp con có method giống hệt nhau về tên, danh sách tham số, kiểu trả về
    // --> Nếu lớp con không ghi đè phương thức này thì phương thức của lớp cha sẽ được gọi khi gọi method này từ đối tượng lớp con
    @Override
    public String toString() {
        return super.toString() + " " + this.lop + " " + this.gpa;
        // super.toString(): gọi các method ở lớp cha
    }
    @Override
    public void greet() {
        System.out.println("Hàm greet của lớp con!");
    }

    // lưu ý: không gọi được this.name và this.birth ở lớp con vì name và birth là private
    // có thể đổi name và birth thành protected
}
