import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

/*
 List<dataType> arr = new ArrayList<>();
 ArrayList<dataType> arr = new ArrayList<>();
 Vector<dataType> v = new Vector<>();
 ArrayList chỉ lưu được các object như Integer, Long, Character, Float ...

    1. add(): thêm 1 phần tử vào cuối
    2. remove(idx): xóa 1 phần tử ở chỉ số idx
    3. remove( (Object) val): xóa 1 phần tử = val
    4. size(): độ dài ArrayList
    5. get(idx): lấy phần tử ở chỉ số idx ~ arr[idx]
    6. set(idx, new_val): gán lại giá trị cho arr[idx]
    7. clear(): xóa toàn bộ
    8. isEmpty(): arraylist trống hay không
    9. contains(): kiểm tra sự tồn tại của 1 phần tử trong arraylist
    10. indexOf(): trả về chỉ số của 1 phần từ trong arraylist
    11. toArray(): ArrayList --> Arrays kiểu Object[]
*/
public class Main {
    public static long sum(ArrayList<Integer> a, int n)
    {
        long s = 0;
        for(int i = 0; i < n; ++i)
        {
            s += a.get(i);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo ArrayList
        ArrayList<Integer> a = new ArrayList<>();


        // Thêm 1 phần tử vào cuối ArrayList
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);


        // a.size(): Số phần tử của arraylist
        System.out.println(a.size());


        // a.get(index): Truy cập thông qua chỉ số
        for(int i = 0; i < a.size(); ++i)
            System.out.print(a.get(i) + " ");
        System.out.println();

        for(Integer x : a) System.out.print(x + " ");
        System.out.println();


        // clear(): xóa toàn bộ ArrayList
        a.clear();
        System.out.println(a.size());


        // isEmpty(): Kiểm tra arraylist rỗng
        System.out.println(a.isEmpty());


        ArrayList<Integer> arr = new ArrayList<>(10000009);
        System.out.println(arr.size()); // cái này khó lói, nma search chat đi, đằng nào cg ko gán lại được bằng arr.get(i)
        for(int i = 1; i <= 5; ++i)
        {
            arr.add(i * i);
        }


        //contains(): Kiểm tra phần tử có nằm trong ArrayList không O(n)
        System.out.println(arr.contains(16));
        System.out.println(arr.contains(17));


        // set(index, new_val): gán lại giá trị cho arr[index]
        arr.set(2, 1000);
        for(Integer x : arr) System.out.print(x + " ");
        System.out.println();


        // remove(index): xóa phần tử arr[index]
        // remove(value): xóa phần tử đầu tiên có giá trị = value
        arr.remove(2);
        for(Integer x : arr) System.out.print(x + " ");
        System.out.println();

        arr.remove((Object) 25);
        for(Integer x : arr) System.out.print(x + " ");
        System.out.println();


        // indexOf(): Trả về chỉ số đầu tiên. Nếu phần tử ko xuất hiện trong ArrayList, trả về - 1
        System.out.println(arr.indexOf(16));
        System.out.println(arr.indexOf(17));


        // toArray(): Trả về mảng các object tương tự trong ArrayList
        Object[] arr2 = arr.toArray();
        for(Object x : arr2) System.out.print(x + " ");
        System.out.println();


        // forEach(): áp dụng 1 hàm nào đó cho các phần tử trong ArrayList
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 1; i <= 5; ++i) arr1.add(i);
        arr1.forEach((x) -> System.out.print(x + " "));
        System.out.println();


        // sort(): Sắp xếp ArrayList
        arr1.sort(null); // mặc định
        arr1.sort((x, y) -> y - x);
        for(Integer x : arr1) System.out.print(x + " ");

        arr1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Collections.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

    }
}