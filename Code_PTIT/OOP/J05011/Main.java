package J05011;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime;

public class Main {
    public static DateTimeFormatter HM = DateTimeFormatter.ofPattern("H:m");
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> arr = new ArrayList<>();
        int T = Integer.parseInt(sc.nextLine());
        while(T-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            arr.add(new Player(id, name, LocalTime.parse(start, HM), LocalTime.parse(end, HM)));
        }
        arr.sort(null);
        for(Player p : arr) {
            System.out.println(p);
        }
    }
}
