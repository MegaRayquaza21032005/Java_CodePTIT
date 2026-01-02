import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        UpdateArrayList u = new UpdateArrayList(num);

        System.out.println("Trước khi thêm phần tử-------------------------------------------------");
        System.out.println(u.getNum().size());
        System.out.println(num.size());

        u.add();

        System.out.println("Sau khi thêm phần tử---------------------------------------------------");
        System.out.println(u.getNum().size());
        System.out.println(num.size());

        for(Integer x : num)
        {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Thêm phần tử ở class khác---------------------------------------------------");
        Them t = new Them(num);
        t.themPhanTu();

        System.out.println(t.getNum().size());
        System.out.println(num.size());

        for(Integer x : num)
        {
            System.out.print(x + " ");
        }
    }
}