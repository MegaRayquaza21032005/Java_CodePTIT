package J05080;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Group> arr = new ArrayList<>();
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String id = sc.nextLine();
            String subject = sc.nextLine();
            String group = sc.nextLine();
            String name = sc.nextLine();
            arr.add(new Group(id, subject, group, name));
        }
        arr.sort(null);
        T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String gv = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + gv + ":");
            for(Group gr : arr) {
                if(gv.compareTo(gr.getName()) == 0) System.out.println(gr);
            }
        }
    }
}
