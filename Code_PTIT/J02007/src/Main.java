import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int test = 1;
        while(T-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int[] a = new int[100009];
            for(int i = 0; i < n; ++i) {
                int x = sc.nextInt();
                arr.add(x);
                a[x]++;
            }
            System.out.println("Test " + test + ":");
            test++;
            for (int x : arr) {
                if(a[x] != 0) {
                    System.out.println(x + " xuat hien " + a[x] + " lan");
                    a[x] = 0;
                }
            }
        }
    }
}