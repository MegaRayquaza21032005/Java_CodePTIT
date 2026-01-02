package J05020;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(T-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new SinhVien(id, name, lop, email));
        }
        arr.sort(null);
        for(SinhVien sv : arr) {
            System.out.println(sv);
        }
    }
}
