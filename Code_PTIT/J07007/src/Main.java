import java.util.Scanner;
import java.io.*;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception{
        File f = new File("VANBAN.in");
        Scanner sc = new Scanner(f);
//        Scanner sc = new Scanner(System.in);
        TreeSet<String> se = new TreeSet<>();
        while(sc.hasNext()) {
            se.add(sc.next().toLowerCase());
        }
        for(String s : se) {
            System.out.println(s);
        }
    }
}