import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static boolean BinarySearch(Integer[] a, int l, int r, int x)
    {
        while(l <= r)
        {
            int m = (l + r) / 2;
            if (a[m] == x) return true;
            else if(a[m] < x) l = m + 1;
            else r = m - 1;
        }
        return false;
    }


    public static boolean BinarySearch1(ArrayList<Integer> a, int l, int r, int x)
    {
        while(l <= r)
        {
            int m = (l + r) / 2;
            if(a.get(m) == x) return true;
            else if(a.get(m) < x) l = m + 1;
            else r = m - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[1000009];   // Muốn sort cmp phải dùng mảng kiểu Object
        for(int i = 1; i <= n; ++i) a[i] = sc.nextInt();
        Arrays.sort(a, 1, n + 1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1 - o2;
            }
        });
        System.out.println(BinarySearch(a, 1, n, 10));

        System.out.println(Arrays.binarySearch(a, 1, n + 1, 10));
    }
}