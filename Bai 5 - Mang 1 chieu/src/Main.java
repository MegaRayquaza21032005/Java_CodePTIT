import java.util.Scanner;

// Data_type [] array = new Data_type [10000000]
// Ngay khi cấp phát, các phần tử = 0 hết

public class Main {
    public static int[] mang = new int[10000000];
    public static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1009]; // cấp phát động một mảng các phần tử = 0
        double[] diem = new double[1009]; // các phần tử = 0
        int[] arr = {1, 2, 3, 4, 5};
        for(int x : arr) System.out.print(x + " ");
        System.out.println();
        for(int i = 0; i <= 10; ++i)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0; i <= 10; ++i)
        {
            System.out.print(mang[i] + " ");
        }
    }
}
