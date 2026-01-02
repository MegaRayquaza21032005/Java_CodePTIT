package J05015;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static DateTimeFormatter HM = DateTimeFormatter.ofPattern("H:m");
    public static String getID(String name, String city) {
        StringBuilder sb = new StringBuilder();
        String[] tmp = name.split("\\s+");
        String[] tmp1 = city.split("\\s+");
        for(String word : tmp1) {
            sb.append(word.charAt(0));
        }
        for(String word : tmp) {
            sb.append(word.charAt(0));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Racer> arr = new ArrayList<>();
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String name = sc.nextLine();
            String city = sc.nextLine();
            String time = sc.nextLine();
            arr.add(new Racer(getID(name, city), name, city, LocalTime.parse(time, HM)));
        }
        arr.sort(null);
        for(Racer racer : arr)
        {
            System.out.println(racer);
        }
    }
}