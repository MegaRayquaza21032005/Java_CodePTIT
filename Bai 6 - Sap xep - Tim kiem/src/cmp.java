import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class cmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[1000009];
        for(int i = 1; i <= n; ++i) a[i] = sc.nextInt();
        Arrays.sort(a, 1, n + 1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 1; i <= n; ++i) System.out.print(a[i] + " ");
    }
}
