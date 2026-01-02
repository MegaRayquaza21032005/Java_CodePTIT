import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int[] a = new int[1009];
    public static int[] mark = new int[1009];
    public static int n, inra = 0;
    public static boolean check(int a[]) {
        for(int i = 2; i <= n; ++i) {
            if(Math.abs(a[i] - a[i - 1]) == 1) return false;
        }
        return true;
    }
    public static void Try(int i) {
        for(int j = 1; j <= n; ++j) {
            if(mark[j] == 0) {
                a[i] = j;
                mark[j] = 1;
                if(i == n) {
                    if(check(a)) {
                        inra = 1;
                        for(int k = 1; k <= n; ++k) {
                            System.out.print(a[k]);
                        }
                        System.out.println();
                    }
                }
                else Try(i + 1);
                mark[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            inra = 0;
            n = sc.nextInt();
            Try(1);
            if(inra == 0) System.out.println();
        }
    }
}