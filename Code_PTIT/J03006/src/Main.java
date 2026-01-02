import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static boolean check(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r) || ((int) s.charAt(l)) % 2 == 1) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            String num = sc.next();
            if(check(num)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}