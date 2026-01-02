import java.util.Scanner;


/*
Bậc của thừa số nguyên tố p trong N!
N/p + N/p^2 + N/p^3 + ...
 */
public class Legendre {
    public static int degree(int n, int p)
    {
        int res = 0;
        for(int i = p; i <= n; i *= p)
        {
            res += n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = sc.nextInt();
        System.out.println(degree(n, p));
    }
}