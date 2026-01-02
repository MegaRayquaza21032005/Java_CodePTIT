import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Them_xoa {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();


        // add(): Thêm các phần tử vào ArrayList
        for(int i = 1; i <= 10; ++i) a.add(i * i);

        for(int i = 0; i < a.size(); ++i)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();


        // remove(index): xóa phần tử Arr[index]
        // remove( (Object) value): xóa phần tử đầu tiên = value
        a.remove(4);
        for(int i = 0; i < a.size(); ++i)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();

        a.remove((Object) 16);
        for(int i = 0; i < a.size(); ++i)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();


        // clear(): xóa toàn bộ ArrayList
        a.clear();
        System.out.println(a.size());
    }
}
