import java.util.*;

/*
KV2B
Hoang Hai Long
8
8,25
8,5

KV2B Hoang Hai Long 2 25.75 PASS
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double math = sc.nextDouble();
        double phys = sc.nextDouble();
        double chems = sc.nextDouble();
        HocSinh x = new HocSinh(id, name, math, phys, chems);
        System.out.println(x);
    }
}