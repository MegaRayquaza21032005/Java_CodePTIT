import java.util.Scanner;

public class gcd_lcm {
    public static int gcd(int a, int b)
    {
        while(b != 0)
        {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
    public static int gcd2(int a, int b)
    {
        if(b == 0) return a;
        else return gcd2(b, a % b);
    }

    public static long lcm(int a, int b)
    {
        return (long) a / gcd(a, b) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(gcd2(a, b));
    }
}
