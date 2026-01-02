import java.util.Scanner;

public class Array1 {
    public static long sum(int a[], int n)
    {
        long s = 0;
        for(int i = 1; i <= n; ++i)
        {
            s += (long) a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10000009];
        for(int i = 1; i <= n; ++i)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; ++i)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(sum(a, n));
    }
}
