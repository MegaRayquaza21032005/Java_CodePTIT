import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
StringBuilder tương tự như String, nhưng cho phép sửa đổi trực tiếp trên xâu gốc

 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // StringBuilder
        String s = "Toi yeu PTIT";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        String tmp = sb.toString(); // chuyển đổi StringBuilder về String

        System.out.println("----------------------------------------------------------------");
        // chuyển số --> xâu
        int n = 12345;
        String n1 = "" + n;
        System.out.println(n1);

        // chuyển xâu thành số
        String s1 = "12345678";
        int n2 = Integer.parseInt(s1);  // Long.parseLong(), Double.parseDouble()


        // Bài toán số nguyên lớn
        System.out.println("-----------------------------------------------------------------");
        String num = "12029489203734856203480523789547023485787530832946526357864652983577548275297024757245789209234520457";
        int sum = 0;
        for(int i = 0; i < num.length(); ++i)
        {
            sum += (num.charAt(i) - '0');
        }

        // Bài toán đêm tần suất các kí tự
        System.out.println("------------------------------------------------------------------");
        // c1: mảng 1 chiều
        // c2: map
        String s2 = "aaaaaabbbbcccc";
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char x : s2.toCharArray())
        {
            if(mp.containsKey(x))
            {
                mp.put(x, mp.get(x) + 1);
            }
            else mp.put(x, 1);
        }
        Set<Map.Entry<Character, Integer>> set = mp.entrySet();
        for(Map.Entry<Character, Integer> entry : set)
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Lớp BigInteger
        System.out.println("------------------------------------------------------------------");
        BigInteger a = new BigInteger("123456789123456789123456789");
        BigInteger b = new BigInteger("200");
        System.out.println(a.add(b)); // subtract, multiply, divide, mod, modPow, pow ...
        System.out.println(a.gcd(b));
    }
}