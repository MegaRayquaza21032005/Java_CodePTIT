package J05013;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        while(T-- > 0) {
            String name = sc.nextLine();
            Float lt = Float.parseFloat((sc.nextLine()));
            Float th = Float.parseFloat((sc.nextLine()));
            if(lt > 10.0) lt /= 10;
            if(th > 10.0) th /= 10;
            arr.add(new ThiSinh(name, lt, th));
        }
        arr.sort(null);
        for(ThiSinh ts : arr) {
            System.out.println(ts);
        }
    }
}