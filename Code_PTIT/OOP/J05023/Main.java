package J05023;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String Normallize(String s) {
        String[] name = s.split("\\s+");
        for(int i = 0; i < name.length; ++i) {
            name[i] = Character.toUpperCase(name[i].charAt(0)) + name[i].substring(1).toLowerCase();
        }
        String res = " ";
        for(String tmp : name) res += tmp + " ";
        return res.trim();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(T-- > 0) {
            String id = sc.nextLine();
            String name = Normallize(sc.nextLine());
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new SinhVien(id, name, lop, email));
        }
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0) {
            String khoa = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN KHOA" + " " + khoa + ":");
            khoa = khoa.substring(2, 4);
            for(SinhVien sv : arr) {
                if(khoa.compareTo(sv.getId().substring(1, 3)) == 0) System.out.println(sv);
            }
        }
    }
}
