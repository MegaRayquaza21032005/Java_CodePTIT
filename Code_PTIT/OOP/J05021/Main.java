package J05021;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(sc.hasNextLine()) {
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
