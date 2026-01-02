import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> tr = new TreeSet<>();
        int[] mark = new int[2000];
        for (int i = 0;  i < n; ++i) {
            int x = sc.nextInt();
            tr.add(x);
        }
        for (int i = 0;  i < m; ++i) {
            int x = sc.nextInt();
            tr.add(x);
        }
        for(Integer x : tr) {
            System.out.print(x + " ");
        }
    }
}