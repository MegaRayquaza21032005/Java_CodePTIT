//import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Move_on_Matrix {
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int[][] a = new int[1009][1009];
    public static int n, m;

    public static void Try(int i, int j)
    {
        a[i][j] = 0;
        for(int k = 0; k < 8; ++k)
        {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 > 0 && i1 <= n && j1 > 0 && j1 <= m && a[i1][j1] == 1)
            {
                Try(i1, j1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 1; i <= n; ++i)
        {
            for(int j = 1; j <= m; ++j)
            {
                a[i][j] = sc.nextInt();
            }
        }
        Try(1, 1);
    }
}
