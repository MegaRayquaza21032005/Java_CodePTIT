import java.util.Scanner;

public class Luy_thua_nhi_phan {
    public static final int mod = 1000000007;

    public static long bin_pow(int n, int k)
    {
        if(k == 0) return 1L;
        else
        {
            long X = bin_pow(n, k / 2) % mod;
            X *= X;
            X %= mod;
            if(k % 2 == 1) return X * n;
            else return X;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(bin_pow(n, k));
    }
}
