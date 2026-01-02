package J05004;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.*;

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        ArrayList<SinhVien> arr = new ArrayList<>();
        int T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            arr.add(new SinhVien(Normallize(sc.nextLine().trim()), sc.nextLine(),
                    LocalDate.parse(sc.nextLine(), dtf),
                    Float.parseFloat(sc.nextLine())));
        }
        for(SinhVien sv : arr) {
            System.out.println(sv);
        }
    }
}