package J05035;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String company = sc.nextLine();
            arr.add(new SinhVien(id, name, lop, email, company));
        }
        arr.sort(null);
        T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String comp = sc.nextLine();
            for(SinhVien sv : arr) {
                if(comp.compareTo(sv.getCompany()) == 0) System.out.println(sv);
            }
        }
    }
}
