import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class Sort_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(8);
        a.add(7);
        a.add(3);
        a.add(9);
        a.add(6);
        a.add(0);


        a.sort(null);
        for(Integer x : a) System.out.print(x + " ");

        a.sort((x, y) -> y - x);
        for(Integer x : a) System.out.print(x + " ");

        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(Integer x : a) System.out.print(x + " ");

        Collections.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(Integer x : a) System.out.print(x + " ");
        System.out.println();


        // Sắp xếp 1 đoạn con trong ArrayList
        List<Integer> b = a.subList(1, 6);
        Collections.sort(b);
    }
}
