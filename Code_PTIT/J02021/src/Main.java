import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int[] a = new int[100009];
    public static int n, k, cnt = 0;
    public static void Try(int i) {
        for(int j = a[i - 1] + 1; j <= n; ++j) {
            a[i] = j;
            if(i == k) {
                cnt++;
                for(int l = 1; l <= k; ++l) {
                    System.out.print(a[l]);
                }
                System.out.print(" ");
            }
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
//        System.out.println();
        System.out.println("\nTong cong co " + cnt + " to hop");
    }
}