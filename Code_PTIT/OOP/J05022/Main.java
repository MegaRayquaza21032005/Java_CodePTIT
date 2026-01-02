package J05022;

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
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0) {
            String lop = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN LOP" + " " + lop + ":");
            for(SinhVien sv : arr) {
                if(lop.compareTo(sv.getLop()) == 0) System.out.println(sv);
            }
        }
    }
}
