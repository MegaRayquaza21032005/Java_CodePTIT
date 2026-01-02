import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Get_set {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i <= 5; ++i) a.add(i * 2);


        // get(index): arr[index]
        for(int i = 0; i < a.size(); ++i)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();


        // set(idx, new_val): arr[idx] = new_val
        a.set(2, 1000);
        for(int i = 0; i < a.size(); ++i)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }
}
