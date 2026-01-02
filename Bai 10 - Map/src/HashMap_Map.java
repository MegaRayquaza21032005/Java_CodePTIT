import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

/*
Map<key_data_type, value_data_type> mp = new HashMap<>()
HashMap<key_data_type, value_data_type> mp = new HashMap<>()

Tính chất:
    HashMap được cài đặt bởi Hash table --> tìm kiếm, thêm, xóa O(1)
    HashMap không có tính thứ tự

Các hàm thông dụng:
    1. put(key, val): thêm cặp key - val vào map
    2. size(): kích thước của map
    3. isEmpty(): Map có rỗng hay không
    4. containsKey(x): có tồn tại x trong tập key không  O(1)
    5. containsValue(x): có tồn tại x trong tập value không  O(1)
    6. get(): trả về value tương ứng với key = x
    8. remove(): xóa key khỏi map
    9. replace(key, new_val): thay thế cặp phần tử x, y
 */
public class HashMap_Map {
    public static void main(String[] args) {
        Map<String, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Long> mp2 = new HashMap<>();


        // 1. put(key, val): thêm 1 cặp (key, val) vào map
        // 2. get(key): mp[key] = val
        mp2.put(1, 2L);
        mp2.put(2, 5L);
        mp2.put(3, 4L);
        mp2.put(4, 6L);
        mp2.put(1, 10L);
        mp2.put(3, 9L);
        System.out.println(1 + " " + mp2.get(1));
        System.out.println(2 + " " + mp2.get(2));
        System.out.println(3 + " " + mp2.get(3));
        System.out.println(4 + " " + mp2.get(4));

        // 3. size():
        System.out.println(mp2.size());

        // 4. containsKey() - containsValue()
        System.out.println(mp2.containsKey(3));
        System.out.println(mp2.containsKey(10));
        System.out.println(mp2.containsValue(10L));
        System.out.println(mp2.containsValue(100L));


        // 5.remove(key)
        mp2.remove(3);


        // 6. replace(key, new_val)
        mp2.replace(2, 1000L);
        System.out.println(mp2.get(2));


        // 7. Duyệt map
        // một cặp (key, val) --> 1 EnTry
        Set<Map.Entry<Integer, Long>> entrySet = mp2.entrySet();   // set<pair<int, int>>
        for(Map.Entry<Integer, Long> x : entrySet)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }


        ArrayList<Map.Entry<Integer, Long>> arr = new ArrayList<>();
        for(Map.Entry<Integer, Long> x : mp2.entrySet())
        {
            arr.add(x);
        }
        for(int i = 0; i <= arr.size(); ++i)
        {
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
    }
}