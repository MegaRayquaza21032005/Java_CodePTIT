import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            long s = 0;
            int p = 0;
            for(int i = 0; i < n; ++i) {
                long x = sc.nextInt();
                arr.add(x);
                s += x;
            }
            long l = 0;
            long r = s;
            boolean check = false;
            for (int i = 0; i < n; ++i) {
                r = r - arr.get(i);
                if(l == r && i != 0 && i != n - 1) {
                    System.out.print(i + 1 + " ");
                    check = true;
                }
                l += arr.get(i);
            }
            if(check == false) {
                System.out.print(-1);
            }
            System.out.println();
        }

    }
}