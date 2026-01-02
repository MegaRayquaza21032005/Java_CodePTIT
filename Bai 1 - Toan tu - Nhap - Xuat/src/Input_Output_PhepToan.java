import java.util.Scanner;

public class Input_Output_PhepToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        long m = sc.nextLong();
//        float f = sc.nextFloat();
//        double d = sc.nextDouble();
//        String s = sc.nextLine();
//        char c = sc.nextLine().charAt(0);
        System.out.println(n);
        int a = 5, b = 2;
        float c = (float) a / b;
        System.out.println(c);
        int d = 1000000000;
        int e = 1000000009;
        long f = 1L * d * e;
        System.out.println(f);
    }
}
