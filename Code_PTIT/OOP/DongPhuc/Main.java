package DongPhuc;

import java.util.TreeMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.io.*;

public class Main {
    public static String Normallize(String s) {
        String[] tmp = s.split("\\s+");
        String res = "";
        for(int i = 0; i < tmp.length; ++i) {
            tmp[i] = Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1);
            res += tmp[i] + " ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws Exception {
        File f = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f);
        TreeMap<String, SinhVien> sinhvien = new TreeMap<>();
        int T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            String gt = sc.nextLine();
            sinhvien.put(id, new SinhVien(id, Normallize(name), lop, email, sdt, gt));
        }

        f = new File("DANGKY.in");
        sc = new Scanner(f);
        while(sc.hasNext()) {
            String id = sc.next();
            String size = sc.next();
            sinhvien.get(id).setSize(size);
        }

        f = new File("TRUYVAN.in");
        sc = new Scanner(f);
        T = sc.nextInt();
        while(T-- > 0) {
            String gt = sc.next();
            String size = sc.next();
            System.out.println("DANH SACH SINH VIEN " + gt.toUpperCase() + " DANG KY SIZE " + size.toUpperCase());
            for(Map.Entry<String, SinhVien> m : sinhvien.entrySet()) {
                SinhVien sv = m.getValue();
                if(gt.compareToIgnoreCase(sv.getGt()) == 0 && size.compareToIgnoreCase(sv.getSize()) == 0) {
                    System.out.println(sv);
                }
            }
        }
    }
}
