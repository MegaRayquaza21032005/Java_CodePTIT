import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Contain_indexOf_toArray_forEach {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i <= 10; ++i) a.add(i * i);

        for(int i = 0; i < a.size(); ++i)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();


        // contains(): Kiểm tra 1 phần tử có nằm trong ArrayList không O(n)
        System.out.println(a.contains(81));
        System.out.println(a.contains(100));
        System.out.println(a.contains(200));


        // indexOf(): Trả về vị trí đầu tiên của value. Nếu ko tồn tại value --> -1
        System.out.println(a.indexOf(25));
        System.out.println(a.indexOf(100));
        System.out.println(a.indexOf(200));


        // toArray(): chuyển ArrayList về Array có kiểu Object
        Object[] arr = a.toArray();
        for(Object x : arr) System.out.print(x + " ");
        System.out.println();


        // forEach(): áp dụng 1 hàm nào đó cho các phần tử trong ArrayList
        a.forEach((x) -> System.out.print(2 * x + " "));
        System.out.println();

    }
}
