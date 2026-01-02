import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000001];
        int M = -1000000000;
        for(int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            if(x > M) M = x;
            a[x] = 1;
        }
        boolean full = true;
        for(int i = 1; i <= M; ++i) {
            if(a[i] == 0) {
                full = false;
                System.out.println(i);
            }
        }
        if(full) System.out.println("Excellent!");
    }
}