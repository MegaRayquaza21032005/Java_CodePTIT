package J05046;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static String getID(String s) {
        String[] a = s.split("\\s+");
        return "" + Character.toUpperCase(a[0].charAt(0)) + Character.toUpperCase(a[1].charAt(0));
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        int T = sc.nextInt();

        while(T-- > 0) {
            sc.nextLine();
            String name = sc.nextLine();
            long quantity = sc.nextLong();
            long price = sc.nextLong();
            String id = getID(name);
            mp.put(id, mp.getOrDefault(id, 0) + 1);
            arr.add(new Product(id + String.format("%02d", mp.get(id)), name, quantity, price));
        }
        for(Product product : arr) {
            System.out.println(product);
        }
    }
}
