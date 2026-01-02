import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
//        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> mp = new TreeMap<>();
        while(sc.hasNext()) {
            String s = sc.next();
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        for(Map.Entry<String, Integer> x : mp.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}