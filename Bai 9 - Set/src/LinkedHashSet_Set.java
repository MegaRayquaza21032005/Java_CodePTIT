import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

/*
Các tính chất của Linked Hash Set
    Chỉ lưu được các phần tử khác nhau
    Được cài đặt bởi bảng băm --> tìm kiếm, thêm, xóa O(1)
    LinkedHashSet có tính thứ tự khi thêm các phần tử vào set
    Chỉ lưu được các phần tử kiểu Object (Integer, Long, String ...)

Các hàm thông dụng:
    1. add(): thêm 1 phần tử
    2. remove(): xóa 1 phần tử
    3. size(): kích thước HashSet
    4. contains(): kiểm tra 1 phần tử có nằm trong HashSet không
    5. clear(): del all
    6. isEmpty(): HashSet rỗng hay không
 */
public class LinkedHashSet_Set {
    public static void main(String[] args) {
        Set<Integer> se1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> se2 = new LinkedHashSet<>();
        int[] a = {1, 3, 5, 7, 9, 4, 3, 4, 7, 9};


        // 1. add(): thêm 1 phần tử
        for(int x : a)
        {
            se1.add(x);
        }

        for(Integer x : se1) System.out.print(x + " ");
        System.out.println();

        // Còn lại giống HashSet
    }
}
