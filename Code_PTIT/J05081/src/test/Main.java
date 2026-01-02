package test;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        while(T-- > 0) {
            arr.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        arr.sort(null);
        for(MatHang mh : arr) {
            System.out.println(mh);
        }
    }
}
