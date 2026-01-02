import java.util.Scanner;

public class FOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= n; ++i)
        {
            System.out.print(i + " ");
            if(i == 4) break;
        }
        System.out.println();
        for(int i = 1; i <= n; ++i)
        {
            if(i == 6 || i == 9) continue;
            System.out.print(i + " ");
        }
    }
}