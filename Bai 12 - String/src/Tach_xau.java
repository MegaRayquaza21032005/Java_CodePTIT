import java.util.StringTokenizer;

public class Tach_xau {
    public static void main(String[] args) {
        String tech = "C++ Python  Java   Javascript    Pytorch   Tensorflow DSA";
        String[] arr = tech.split("\\s+");
        for(String x : arr)
        {
            System.out.println(x);
        }

        String tech1 = "Cac!?--ngon..ngu  lap--trinh!!..thong  ??dung";
        // --> chuyển các dấu !?..-- thành dấu " " --> split("\\s+")

        // StringTokenizer
        StringTokenizer st = new StringTokenizer(tech);
        while(st.hasMoreTokens())
        {
            System.out.print(st.nextToken() + " - ");
        }
    }
}
