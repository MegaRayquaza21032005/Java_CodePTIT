import java.util.*;

/*
1. Class và Object
    ví dụ class Person có một object là "Nguyen Thanh Dat", "Le Yen Nhi"

2. Thuộc tính và Phương thức
    Thuộc tính (Attribute, nói nôm na là biến trong class)
    Phương thức (Method, Behavior, hàm trong class)

    vd: class Person
        Attribute: name, date, id, address, phoneNumber;
        Method: đi lại(), ăn uống(), ngủ nghỉ(), học hành()

3. Tính đóng gói (Encapsulation)
    private: các biến chỉ có thể truy cập bên trong class, muốn truy cập và thay đổi bên ngoài --> get và set
    public: truy cập cả trong và ngoài class đều được

 */
public class Main {
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        sv.eat();
        System.out.println("-------------------------------------------------------------------------");
        SinhVien sv1 = new SinhVien("Dat", "Hanoi", "21/03", 3.8);
        sv1.info();
        sv1.setGpa(4.0);
        sv1.setName("Nguyen Quang Chien");
        sv1.setAddress("Nghean");
        sv1.info();

        System.out.println("-------------------------------------------------------------------------");
        System.out.println(sv1); // in ra hashcode nếu không cài đặt toString trong class

        System.out.println("-------------------------------------------------------------------------");
        // Stactic key word
        sv1 = new SinhVien("Dat", "Hanoi", "21/03", 3.8);
        SinhVien sv2 = new SinhVien("Nhi","Thanhhoa", "29/09", 3.7);
        System.out.println(sv1.getCount());
        System.out.println(sv2.getCount());
        SinhVien sv3 = new SinhVien("Kien","Hanoi", "08/01", 3.7);
        System.out.println(sv1.getCount());
        System.out.println(sv2.getCount());
        System.out.println(sv3.getCount());

        // static method
        System.out.println("____________________");
        System.out.println(SinhVien.getCount1());
    }
}