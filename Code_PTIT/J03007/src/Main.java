import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static boolean check(String s) {
        int l = 0, r = s.length() - 1;
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        int sum = 0;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            sum += 2 * (s.charAt(l) - '0');
            l++;
            r--;
        }
        if(l == r) sum += (s.charAt(l) - '0');
        return sum % 10 == 0;
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