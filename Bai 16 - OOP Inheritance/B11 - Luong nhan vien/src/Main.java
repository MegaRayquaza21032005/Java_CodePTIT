import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien("NV01", sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        System.out.println(a);

    }
}

/*
Nguyen Van Teo
PGD
26000
25

NV01 Nguyen Van Teo 650000 130000 200000 980000
 */