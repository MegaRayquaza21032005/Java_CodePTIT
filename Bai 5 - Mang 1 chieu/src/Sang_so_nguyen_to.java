import java.util.Scanner;

public class Sang_so_nguyen_to {
    public static int[] prime = new int[10000009];

    public static void sang()
    {
        for(int i = 0; i <= 1000000; ++i) prime[i] = 1;
        prime[0] = prime[1] = 0;
        for(int i = 2; i <= Math.sqrt(1000000); ++i)
        {
            if(prime[i] == 1)
            {
                for(int j = i * i; j <= 1000000; j += i)
                {
                    prime[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int n = sc.nextInt();
        System.out.println(prime[n]);
    }
}
