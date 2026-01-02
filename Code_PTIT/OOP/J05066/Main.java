package J05066;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int T = Integer.parseInt(sc.nextLine());
        int gd = 1, tp = 3, pp = 3;
        while(T-- > 0) {
            String id = sc.next();
            String name = sc.nextLine().trim();
            String cvu = id.substring(0, 2);
            int hieuso = Integer.parseInt(id.substring(4));
            if(cvu.equals("GD")) {
                if(gd == 0 || hieuso > 1) {
                    id = "NV" + id.substring(2);
                }
                else gd--;
            }
            else if(cvu.equals("TP")) {
                if(tp == 0 || hieuso > 3) {
                    id = "NV" + id.substring(2);
                }
                else tp--;
            }
            else if(cvu.equals("PP")) {
                if(pp == 0 || hieuso > 3) {
                    id = "NV" + id.substring(2);
                }
                else pp--;
            }
            arr.add(new NhanVien(id, name));
        }
        arr.sort(null);
        T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            String tmp = sc.nextLine();
            for(NhanVien nv : arr) {
                if(nv.getName().toLowerCase().contains(tmp.toLowerCase())) System.out.println(nv);
            }
            System.out.println();
        }
    }
}
