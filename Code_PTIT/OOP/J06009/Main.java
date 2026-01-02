package J06009;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("KH.in");
        Scanner sc = new Scanner(f);

        HashMap<String, KhachHang> customer = new HashMap<>();
        int T = Integer.parseInt(sc.nextLine());
        int cnt = 1;
        while(T-- > 0) {
            String id = String.format("KH%03d", cnt);
            ++cnt;
            String name = sc.nextLine();
            String gt = sc.nextLine();
            String dob = sc.nextLine();
            String adr = sc.nextLine();
            customer.put(id, new KhachHang(id, name, gt, dob, adr));
        }

        f = new File("MH.in");
        sc = new Scanner(f);
        HashMap<String, MatHang> product = new HashMap<>();
        T = Integer.parseInt(sc.nextLine());
        cnt = 1;
        while(T-- > 0) {
            String id = String.format("MH%03d", cnt);
            cnt += 1;
            String name = sc.nextLine();
            String dvi = sc.nextLine();
            long giamua = Long.parseLong(sc.nextLine());
            long giaban = Long.parseLong(sc.nextLine());
            product.put(id, new MatHang(id, name, dvi, giamua, giaban));
        }

        f = new File("HD.in");
        sc = new Scanner(f);
        T = Integer.parseInt(sc.nextLine());
        cnt = 1;
        while(T-- > 0) {
            String kh = sc.next();
            String mh = sc.next();
            int soluong = sc.nextInt();
            System.out.print(String.format("HD%03d", cnt) + " ");
            cnt += 1;
            System.out.print(customer.get(kh));
            System.out.print(product.get(mh));
            System.out.println(soluong + " " + (soluong * product.get(mh).getGiaban()));
        }
    }
}
