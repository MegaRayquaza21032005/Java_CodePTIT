import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Comparator_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Integer[] a = new Integer[1000009]; // phải là mảng kiểu Object mới có thể sort cmp
        for(int i = 0; i < n; ++i) a[i] = sc.nextInt();


        Arrays.sort(a, 0, n, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return -1; // true
                else if(o1 > o2) return 1; // false
                else return 0;
            }
        });


        for(int i = 0; i < n; ++i) System.out.print(a[i] + " ");
    }
}
