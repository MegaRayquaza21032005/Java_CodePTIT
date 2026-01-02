import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;


/*
    HashSet chỉ lưu được các phần tử khác nhau
    HashSet được cài đặt bởi bàng băm --> tìm kiếm O(1), thêm - xóa O(1)
    HashSet không có thứ tự
    HashSet chỉ lưu được phàn tử kiếu Object (Integer, Long, String ...)

    Các hàm thông dụng
    1. add(): thêm 1 phần tử
    2. remove(): xóa 1 phần tử
    3. size(): kích thước HashSet
    4. contains(): kiểm tra 1 phần tử có nằm trong HashSet không
    5. clear(): del all
    6. isEmpty(): HashSet rỗng hay không
 */
public class HashSet_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo
        Set<Integer> se1 = new HashSet<>();
        HashSet<Integer> se2 = new HashSet<>();

        // add(): thêm 1 phần tử
        for(int i = 1; i <= 10; ++i)
        {
            se1.add(i * i);
        }
        for(Integer x : se1) System.out.print(x + " ");
        System.out.println();


        //remove(): xóa 1 phần tử
        se1.remove(100);
        se1.remove(16);
        for(int x : se1) System.out.print(x + " "); // x kiểu Integer ép sang kiểu int
        System.out.println();

        // size() - contains(): O(1)
        System.out.println(se1.size());
        System.out.println(se1.contains(9));
        System.out.println(se1.contains(1000));

        // clear() - isEmpty()
        se1.clear();
        System.out.println(se1.isEmpty());
    }
}
