import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static boolean check(ArrayList<Integer> arr) {
        int l = 0, r = arr.size() - 1;
        while(l < r) {
            if(arr.get(l) != arr.get(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; ++i) {
                int x = sc.nextInt();
                arr.add(x);
            }
            if(check(arr)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}