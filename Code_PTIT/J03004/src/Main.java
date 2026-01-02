import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static String capitalize(String s) {
        s = s.toLowerCase();
        return Character.toUpperCase(s.charAt(0))+ s.substring(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String nhap = sc.nextLine().trim();
            String[] a = nhap.split("\\s+");
//            for(String x : a) {
//                System.out.println(x);
//            }
            for(int i = 0; i < a.length; ++i) {
                a[i] = capitalize(a[i]);
            }
            String res = a[0];
            for(int i = 1; i < a.length; ++i) {
                res = res + " " + a[i];
            }
            System.out.println(res);
        }
    }
}