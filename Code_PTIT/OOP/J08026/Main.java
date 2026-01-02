package J08026;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static int check(int a, int b) {
        int[] mark = new int[1000000];
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(a);
        mark[a] = 0;
        while(!dq.isEmpty()) {
            int u = dq.pollFirst();
            if(u == b) return mark[u];
            if(u - 1 >= 0 && mark[u - 1] == 0) {
                dq.addLast(u - 1);
                mark[u - 1] = mark[u] + 1;
            }
            if(u <= b && mark[u * 2] == 0){
                dq.addLast(u * 2);
                mark[u * 2] = mark[u] + 1;
            }
        }
        return mark[b];
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(check(a, b));
        }
    }
}
