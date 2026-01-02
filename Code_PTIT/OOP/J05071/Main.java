package J05071;

import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static DateTimeFormatter HM = DateTimeFormatter.ofPattern("H:m");
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String, City> giacuoc = new HashMap<>();
        int T = sc.nextInt();
        while(T-- > 0) {
            sc.nextLine();
            String id = sc.nextLine();
            String city = sc.nextLine();
            long cuoc = sc.nextLong();
            giacuoc.put(id, new City(id, city, cuoc));
        }
        T = sc.nextInt();
        while(T-- > 0) {
            String sdt = sc.next();
            LocalTime start = LocalTime.parse(sc.next(), HM);
            LocalTime end = LocalTime.parse(sc.next(), HM);
            long minutes = ChronoUnit.MINUTES.between(start, end);
            if(sdt.charAt(0) == '0') {
                String id = sdt.substring(1, 3);
                long price = giacuoc.get(id).getCuoc() * minutes;
                System.out.println(sdt + " " + giacuoc.get(id).getName() + " " + minutes + " " + price);
            }
            else {
                minutes = (long) Math.ceil((double) minutes / 3);
                System.out.println(sdt + " Noi mang " + minutes + " " + minutes * 800);
            }
        }
    }
}
