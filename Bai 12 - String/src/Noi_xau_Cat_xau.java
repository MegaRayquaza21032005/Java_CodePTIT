import java.util.Scanner;
import java.util.StringTokenizer;

public class Noi_xau_Cat_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Le Yen Nhi", b = "zzz";

        // Nối xâu bằng dấu +
        String sleep = a + " " + b;
        System.out.println(sleep);

        // concat(): nối xâu
        System.out.println(a.concat(" " + b));

        // subString(L, R): cắt xâu từ [L, R)
        String sub_sleeps = sleep.substring(3);
        System.out.println(sub_sleeps);
        String sub_sleeps1 = sleep.substring(3, 10);
        System.out.println(sub_sleeps1);

        // subSequence(L, R): cắt xâu từ [L, R)
        CharSequence sub_seq = sleep.subSequence(3, 10);
        System.out.println(sub_seq);
    }
}
