package J05012;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int T = sc.nextInt();
        while(T-- > 0) {
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            long quantity = sc.nextLong();
            long price = sc.nextLong();
            long discount = sc.nextLong();
            arr.add(new Product(id, name, quantity, price, discount));
        }
        arr.sort(null);
        for(Product p : arr) {
            System.out.println(p);
        }
    }
}
