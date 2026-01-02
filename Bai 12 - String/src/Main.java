import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Các tính chất cơ bản:
    1. sc.next(): Nhập không dáu cách
    2. sc.nextLine(): Nhập có dấu cách --> xủ lý trôi lệnh
    3. length(): độ dài String
    4. charAt(idx): truy cập vào kí tự có chỉ số idx
    5. toUpperCase(): Chuyển String về in hoa
    6. toLowerCase(): chuyển String về in thường
    7. concat(): nối 2 xâu
    8. compareTo(): so sánh 2 xâu, nếu = nhau --> return 0, nếu s < t --> return -, nếu s > t --> return +
    9. compareToIgnoreCase(): bỏ qua in hoa in thường và so sánh
    10. equals() / equalsIgnoreCase(): check 2 xâu = nhau
    11. substring(): cắt xâu từ vị trí left idx đến right idx
    12. subSequence(): cắt xâu từ L -> R   [L, R)
    13. contains(): kiểm tra xâu con
    14. các hàm kiểm tra loại kí tự: isDigit(char c), isAlphabetic(char c), isLowerCase(), isUpperCase(), Character.ToLowerCase(), Character.ToUpperCase()
    15. split("\\s+"): tách xâu
    16. StringTokenizer: tach xâu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Nguyen Thanh Dat";
        System.out.println(name);


//        // nextLine(): Nhập xâu
//        String tmp = sc.next();     // nhập không có dấu cách
//
//        sc.nextLine(); // khử trôi lệnh - đọc mất phím enter thừa
//        String s = sc.nextLine();   // nhập có dấu cách - bị trôi lệnh


        // length(): độ dài xâu
        System.out.println(name.length());

        // charAt(inx): truy cập kí tự có chỉ số idx
        System.out.println("----------------------------------------------------------------");
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(7));
        for(int i = 0; i < name.length(); ++i)
        {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        // String ko có for each --> chuyển String về Array
        System.out.println("----------------------------------------------------------------");
        for(char x : name.toCharArray()) {
            System.out.print(x + " ");
        }
        System.out.println();


        // toUpperCase(): in hoa
        System.out.println("----------------------------------------------------------------");
        String s = name.toUpperCase();
        System.out.println(s);

        // toLowerCase(): in thường
        String t = name.toLowerCase();
        System.out.println(t);

        // concat(): nối 2 xâu
        System.out.println("----------------------------------------------------------------");
        s = "pro";
        t = "super";
        String noi = s.concat(t);
        System.out.println(noi);
        System.out.println(s + t);

        // compareTo(): so sánh 2 xâu
        //      nếu = nhau: trả về 0
        //      nếu nhỏ hơn: trả về âm
        //      nếu lớn hơn: trả về dương
        System.out.println("----------------------------------------------------------------");
        String a = "abc";
        String b = "abc";
        String c = "z";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(c.compareTo(a));

        // compareToIgnoreCase(): như trên nhưng bỏ qua viết hoa - viết thường
        String x = "ABC";
        String y = "abc";
        System.out.println(x.compareTo(y));
        System.out.println(x.compareToIgnoreCase(y));

        // substring(): cắt xâu từ vị trí idx đến hết
        System.out.println("----------------------------------------------------------------");
        String name1 = "Le Yen Nhi";
        String sub_name1 = name1.substring(3);
        System.out.println(sub_name1);
        System.out.println(name1.substring(3, 6)); // ko lấy kí tự thứ 6

        // subSequence(): giống substring()
        System.out.println(name1.subSequence(0, 6));

        // contains(): kiểm tra xâu con
        System.out.println("----------------------------------------------------------------");
        String a1 = "abcdef";
        String b1 = "bcd";
        System.out.println(a1.contains(b1));

        // replace(): thay thế kí tự cũ thành kí tự mới
        System.out.println("----------------------------------------------------------------");
        String a2 = "Nguyen Thanh Dat";
        a2 = a2.replace('n', '$');
        System.out.println(a2);

        // split(): tách từ trong xâu
        System.out.println("----------------------------------------------------------------");
        String tech = "C++ Python  Java   Javascript    Pytorch   Tensorflow DSA";
        String[] arr = tech.split(" ");
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
        String[] arr1 = tech.split("\\s+");
        for(int i = 0; i < arr1.length; ++i)
        {
            System.out.println(arr1[i]);
        }

        String tech1 = "Cac!?--ngon..ngu  lap--trinh!!..thong  ??dung";
        // --> chuyển các dấu !?..-- thành dấu " " --> split("\\s+")

        // StringTokenizer
        tech = "C++ Python  Java   Javascript    Pytorch   Tensorflow DSA";
        StringTokenizer st = new StringTokenizer(tech);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}