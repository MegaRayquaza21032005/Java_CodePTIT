package J05003;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        ArrayList<SinhVien> arr = new ArrayList<>();
        int T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(),
                    LocalDate.parse(sc.nextLine(), dtf),
                    Float.parseFloat(sc.nextLine())));
        }
        for(SinhVien sv : arr) {
            System.out.println(sv);
        }
    }
}
