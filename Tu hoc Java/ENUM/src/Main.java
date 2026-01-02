import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season.getWeather());
        System.out.println(season.getMonth());
        System.out.println("----------------------------------------------");
        for (Season s : Season.values()) {
            System.out.println(s.getWeather() + " " + s.getMonth());
        }
    }
}
