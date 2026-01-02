import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
Các tính chất cơ bản của TreeSet:
    Chỉ lưu được các phần tử khác nhau
    Được cài đặt bởi cây đỏ đen (black red tree) --> tìm kiếm, thêm, xóa O(logN)
    TreeSet có thứ tự và được sắp xếp theo thứ tự tăng dần
    Chỉ lưu được phần tử kiểu Object (Integer, Long, String ...)

Các hàm thông dụng
    1. add(): thêm 1 phần tử
    2. remove(): xóa 1 phần tử
    3. size(): kích thước HashSet
    4. contains(): kiểm tra 1 phần tử có nằm trong HashSet không
    5. clear(): del all
    6. isEmpty(): HashSet rỗng hay không

Một số hàm khác:
    1. floor(x): trả về phần tử lớn nhất <= x, nếu ko tồn tại trả về null
    2. ceiling(x): trả về phần tử nhỏ nhất >= x, nếu ko tồn tại --> null
    3. first(): trả về phần tử đầu tiên trong TreeSet
    4. last(): trả về phần tử cuối cùng trong TreeSet
    5. lower(x): trả về phần tử lớn nhất < x, nếu ko tồn tại --> null
    6. higher(x): trả về phần tử nhỏ nhất > x, nếu ko tồn tại --> null
 */
public class TreeSet_Set {
    public static void main(String[] args)
    {
        int[] a = {5, 3, 2, 2, 1, 1, 1, 3, 4, 6, 7, 6, 4, 8, 8, 9, 5, 4};
        TreeSet<Integer> se1 = new TreeSet<>();

        for(int x : a)
        {
            se1.add(x);
        }

        for(Integer x : se1) System.out.print(x + " ");
        System.out.println();

        System.out.println(se1.floor(4));
        System.out.println(se1.ceiling(4));
        System.out.println(se1.lower(4));
        System.out.println(se1.higher(4));
        System.out.println(se1.first());
        System.out.println(se1.last());
    }
}
