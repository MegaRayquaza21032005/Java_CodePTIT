import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

/*
Các tính chất:
    LinkedHashMap được cài đặt bằng Hash table --> tìm kiếm, thêm, xóa O(1)
    LinkdedHashMap có tính thứ tự, key sẽ được sắp xếp theo thứ tự thêm vào

Các hàm thông dụng (giống HashMap):
    1. put(key, val): thêm cặp key - val vào map  O(1)
    2. size(): kích thước của map
    3. isEmpty(): Map có rỗng hay không
    4. containsKey(x): có tồn tại x trong tập key không  O(1)
    5. containsValue(x): có tồn tại x trong tập value không  O(1)
    6. get(): trả về value tương ứng với key = x
    8. remove(): xóa key khỏi map
    9. replace(key, new_val): thay thế cặp phần tử x, y

 */
public class LinkedHashMap_Map {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> mp1 = new LinkedHashMap<>();
        Map<Integer, String> mp2 = new LinkedHashMap<>();
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
