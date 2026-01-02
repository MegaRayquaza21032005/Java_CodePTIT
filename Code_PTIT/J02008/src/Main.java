import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int test = 1;
        while(T-- > 0) {
            int n = sc.nextInt();
            BigInteger res = new BigInteger("1");
            for (int i = 1; i <= n; ++i) {
                BigInteger x = BigInteger.valueOf(i);
                res = res.multiply(x).divide(res.gcd(x));
            }
            System.out.println(res);
        }

    }
}