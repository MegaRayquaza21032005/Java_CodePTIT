import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] mark = new int[2000];
        for (int i = 0;  i < n; ++i) {
            int x = sc.nextInt();
            arr1.add(x);
            mark[x] = 1;
        }
        for (int i = 0;  i < m; ++i) {
            arr2.add(sc.nextInt());
        }
        arr2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(int i = 0; i < arr2.size(); ++i) {
            if(mark[arr2.get(i)] == 1) {
                System.out.print(arr2.get(i) + " ");
                mark[arr2.get(i)] = 0;
            }
        }
    }
}