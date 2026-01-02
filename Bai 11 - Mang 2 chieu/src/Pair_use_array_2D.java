import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/*
Cho n diểm trong hệ tọa độ Oxy, mỗi điê có 2 thông sô hoành độ và tung độ
Sắp xếp theo hoành độ tăng dần, nếu cùng hoàng độ thì sx theo tung độ tăng dần
 */
public class Pair_use_array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] a = new Integer[n + 9][2];
        for(int i = 1; i <= n; ++i)
        {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if(o1[0] < o2[0]) return -1;
                else if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return -1;
            }
        });
    }
}
