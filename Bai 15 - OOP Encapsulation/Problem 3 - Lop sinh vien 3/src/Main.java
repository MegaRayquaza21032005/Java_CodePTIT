import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String birth = sc.nextLine();
        float point = sc.nextFloat();
        SinhVien x = new SinhVien("SV001", name, lop, birth, point);
        x.chuanhoa();
        x.info();
    }
}