import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

/*
Map lưu trữ phần tử theo cặp key - values
1 key tương ứng với 1 val duy nhất
các key là riêng biệt, ko có 2 key nào trùng nhau
Map có thể tìm kiếm nhanh
Map có thể dùng key là index truy cập vào val tương ứng
Map chỉ lưu các phần tử Object (Integer, Long, String ...)


    1. put(key, val): thêm cặp key - val vào map  O(1)
    2. size(): kích thước của map
    3. isEmpty(): Map có rỗng hay không
    4. containsKey(x): có tồn tại x trong tập key không  O(1)
    5. containsValue(x): có tồn tại x trong tập value không  O(1)
    6. get(): trả về value tương ứng với key = x
    8. remove(): xóa key khỏi map
    9. replace(key, new_val): thay thế cặp phần tử x, y
 */


public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new TreeMap<>();
        TreeMap<Integer, Integer> mp1 = new TreeMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        LinkedHashMap<Integer, Integer> mp3 = new LinkedHashMap<>();
    }
}