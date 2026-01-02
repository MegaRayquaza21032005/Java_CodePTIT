package J07038;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.io.*;

public class Main {
    public static String Normallize(String s) {
        String[] tmp = s.split("\\s+");
        String res = "";
        for(int i = 0; i < tmp.length; ++i) {
            tmp[i] = Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase();
        }
        for(String word : tmp) {
            res += word + " ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws Exception {
        File f = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f);
//        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        HashMap<String, SinhVien> sinhvien = new HashMap<>();  // danh sach sinh vien
        while(T-- > 0) {
            String id = sc.nextLine();
            String name = Normallize(sc.nextLine());
            String lop = sc.nextLine();
            String email = sc.nextLine();
            sinhvien.put(id, new SinhVien(id, name, lop, email));
        }

        f = new File("DN.in");
        sc = new Scanner(f);
        HashMap<String, Company> company = new HashMap<>();  // danh sach cong ty
        HashMap<String, TreeSet<SinhVien>> intern = new HashMap<>();  // danh sach thuc tap
        T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int number = Integer.parseInt(sc.nextLine());
            intern.put(ma, new TreeSet<SinhVien>());
            company.put(ma, new Company(ma, name, number));
        }


        f = new File("THUCTAP.in");
        sc = new Scanner(f);
        T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            String msv = sc.next();
            String comp = sc.next();
            sc.nextLine();
            intern.get(comp).add(sinhvien.get(msv));
        }


        T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            String macty = sc.nextLine();
            System.out.println("DANH SACH THUC TAP TAI " + company.get(macty).getName() + ":");
            int cnt = 0;
            for(SinhVien sv : intern.get(macty)) {
                cnt += 1;
                if(cnt <= company.get(macty).getNumber()) System.out.println(sv);
                else break;
            }
        }
    }
}
