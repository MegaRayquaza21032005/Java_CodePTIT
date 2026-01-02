public class SinhVien {
    private String name, address, birth; // Object attribute
    private double gpa;

    // Hàm tạo - constructor
    SinhVien() // hàm tạo mặc định không có tham số
    {
        System.out.println("Khởi tạo");
        this.count++;
    }
    SinhVien(String name, String address, String birth, double gpa) { // hàm tạo với đầy đủ tham số
        this.name = name;     // con trỏ this (this key word)
        this.address = address;
        this.birth = birth;
        this.gpa = gpa;
        this.count++;
    }

    public void eat(){
        System.out.println("EAT");
    }

    public void info() {
        System.out.println(this.name + " " + this.address + " " + this.birth + " " + this.gpa);
    }

    // getter(): lấy về thông tin của một thuộc tính
    // setter(): thay đổi thông tin của 1 thuộc tính
//    public double getGpa() {
//        return this.gpa;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public String getAddress(){
//        return this.address;
//    }
//    public String getBirth(){
//        return this.birth;
//    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBirth() {
        return birth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    // toString() --> thay thế hàm info()
    public String toString()
    {
        return this.name + " " + this.address + " " + this.birth + " " + this.gpa + " Lop truong lop D23CQCN10-B";
    }

    // Biến Static và hàm Static
    // Biến static: biến dùng chung cho mọi object
    private static int count = 0; // class attribute

    public int getCount() {
        return count;
    }
    public static int getCount1() {
        return count;
        // lưu ý: không được return this.count vì đây là hàm static dùng chung cho mọi Object trong class
        // từ khóa this chỉ đích danh 1 Object trong class (tham chiếu tới Object hiện tại, ko còn dùng chung)
    }
}
