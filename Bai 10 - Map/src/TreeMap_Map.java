import java.util.*; // chứa tất cả mọi thứ cần thiết
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

/*
Các tính chất:
    TreeMap được cài đặt bằng cây đỏ đen (red - black tree) --> tìm kiếm, thêm, xóa O(logN)
    TreeMap có tính thứ tự, các key được sắp xếp tăng dần

Các hàm thông dụng (giống HashMap):
    1. put(key, val): thêm cặp key - val vào map  O(1)
    2. size(): kích thước của map
    3. isEmpty(): Map có rỗng hay không
    4. containsKey(x): có tồn tại x trong tập key không  O(1)
    5. containsValue(x): có tồn tại x trong tập value không  O(1)
    6. get(): trả về value tương ứng với key = x
    8. remove(): xóa key khỏi map
    9. replace(key, new_val): thay thế cặp phần tử x, y

Các hàm bổ sung (Do có tính thứ tự):
    1. firstKey(): Trả về key đầu tiên trong map
    2. lastKey(): Trả về key cuối cùng trong map
    3. firstEntry(): Trả về cặp (key, val) đầu tiên trong map
    4. lastEntry(): Trả về cặp (key, val) cuối cùng trong map
    5. floorKey(x): Trả về key lớn nhất <= x
    6. ceilingKey(x): Trả về key nhỏ nhất >= x
    7. floorEntry(x): trả về cặp (key, value) có key lớn nhất và <= x
    8. ceilingEntry(x): trả về cặp(key, value) có value nhỏ nhất và >= x

 */
public class TreeMap_Map {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> mp1 = new TreeMap<>();
        Map<Integer, String> mp2 = new TreeMap<>();
        mp1.put(1, 2);
        mp1.put(3, 5);
        mp1.put(2, 4);
        mp1.put(4, 6);
        mp1.put(1, 10);
        mp1.put(3, 9);
        mp1.put(0, 100);

        Set<Map.Entry<Integer, Integer>> se = mp1.entrySet();
        for(Map.Entry<Integer, Integer> x : se)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }


        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> x : mp1.entrySet())
        {
            arr.add(x);
        }
        for(int i = 0; i <= arr.size(); ++i)
        {
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
    }
}
