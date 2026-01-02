import java.util.Scanner;

public class To_hop {
    public static long C(int n, int k) {
        if(k == 0 || k == n) return 1L;
        return (long) C(n - 1, k - 1) + (long) C(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(C(n, k));
    }
}
