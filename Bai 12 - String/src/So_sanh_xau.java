public class So_sanh_xau {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "zz";
        String c = "ABcd";


        // compareTo(): a < b --> trả về số âm         a > b --> trả về số dương        a == b --> trả về 0
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(b.compareTo(b));

        // compareToIgnoreCase(): so sánh bỏ qua in hoa, in thường
        System.out.println("________________________________________________________________");
        System.out.println(a.compareToIgnoreCase((c)));
        System.out.println(a.compareTo(c));

        // equals() / equalsIgnoreCase()
        System.out.println(a.equals(b));

        // equals(): so sánh về mặt nội dung 2 xâu
        // ==: so sánh địa chỉ ô nhớ của 2 xâu (tìm hiểu thêm về hashcode())
        System.out.println("________________________________________________________________");
        String x = "Dat", y = "Dat";
        System.out.println(x == y);
        System.out.println(x.equals(y));

        System.out.println("________________________________________________________________");
        String x1 = new String("Dat"), y1 = new String("Dat");
        System.out.println(x1 == y1);
        System.out.println(x1.equals(y1));
    }
}
