//import java.util.*;
import java.util.Scanner;
import java.util.Arrays;


/*
    dataType[][] arr = new dataType[1009][1009]
 */
public class Main {
    public static long sum(int a[][], int n, int m)
    {
        long s = 0;
        for(int i = 1; i <= n; ++i)
        {
            for(int j = 1; j <= m; ++j)
            {
                s += (long) a[i][j];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int[][] a = new int[1009][1009];

        for(int i = 1; i <= n; ++i)
        {
            for(int j = 1; j <= m; ++j)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(sum(a, n, m));
    }
}