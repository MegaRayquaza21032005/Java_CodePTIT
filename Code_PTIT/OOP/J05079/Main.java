package J05079;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Group> arr = new ArrayList<>();
        HashMap<String, String> mp = new HashMap<>();
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String id = sc.nextLine();
            String subject = sc.nextLine();
            String group = sc.nextLine();
            String name = sc.nextLine();
            mp.put(id, subject);
            arr.add(new Group(id, subject, group, name));
        }
        arr.sort(null);
        T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String malop = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + mp.get(malop) + ":");
            for(Group gr : arr) {
                if(malop.compareTo(gr.getId()) == 0) System.out.println(gr);
            }
        }
    }
}
