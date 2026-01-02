import java.util.Scanner;

public class Phan_tich_thua_so_nguyen_to {
    public static void phantich(int n)
    {
        for(int i = 2; i <= Math.sqrt(n); ++i)
        {
            if(n % i == 0)
            {
                while(n % i == 0)
                {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
        if(n != 1) System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        phantich(n);
    }
}