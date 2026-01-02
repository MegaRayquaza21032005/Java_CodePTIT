package J04018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            SoPhuc sp1 = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc sp2 = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc tong = (sp1.add(sp2)).mul(sp1);
            SoPhuc thuong = (sp1.add(sp2)).mul(sp1.add(sp2));
            System.out.println(tong + ", " + thuong);
        }
    }
}