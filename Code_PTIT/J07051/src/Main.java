import java.io.*;
import java.time.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static DateTimeFormatter DMY = DateTimeFormatter.ofPattern("d/M/yyyy");
    public static String Capitalize(String s) {
        String[] a = s.split("\\s+");
        String res = "";
        for(int i = 0; i < a.length; ++i) {
            a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1).toLowerCase();
        }
        for(String x : a){
            if(res != "") res = res + " " + x;
            else res += x;
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        File f = new File("KHACHHANG.in");
        Scanner sc = new Scanner(f);
//        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> kh = new ArrayList<>();
        int T = sc.nextInt();
        while(T-- > 0) {
            sc.nextLine();
            String name = sc.nextLine().trim();
            String phong = sc.nextLine().trim();
            String start = sc.nextLine().trim();
            String end = sc.nextLine().trim();
            int phuphi = sc.nextInt();
            KhachHang x = new KhachHang(Capitalize(name), phong,
                    LocalDate.parse(start, DMY),
                    LocalDate.parse(end, DMY),
                    phuphi);
            kh.add(x);
        }
        Collections.sort(kh, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return Long.compare(o2.tongChiPhi(), o1.tongChiPhi());
            }
        });
        for(KhachHang k : kh) {
            System.out.println(k);
        }
    }
}