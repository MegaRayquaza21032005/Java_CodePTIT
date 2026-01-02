import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Duyet_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        // add(): Thêm 1 phần tử vào cuối ArrayList
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        // a.size(): Kích thước ArrayList
        for(int i = 0; i < a.size(); ++i)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        for(Integer x : a)
        {
            System.out.print(x + " ");
        }
    }
}
