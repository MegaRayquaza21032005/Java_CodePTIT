package J05032;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static DateTimeFormatter DMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int T = sc.nextInt();
        while(T-- > 0) {
            String name = sc.next();
            String date = sc.next();
            arr.add(new Person(name, LocalDate.parse(date, DMY)));
        }
        arr.sort(null);
        System.out.println(arr.get(arr.size() - 1).getName());
        System.out.println(arr.get(0).getName());
    }

}
