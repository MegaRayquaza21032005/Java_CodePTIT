import java.io.*;
import java.util.Scanner;

public class Main {
    public static String Capitalize(String s) {
        String[] a = s.split("\\s+");
        String res = "";
        for(int i = 0; i < a.length; ++i) {
            a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1).toLowerCase();
        }
        for(String x : a){
            if(res != "") res = res + " " + x;
            else res += x;
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
//        Scanner sc = new Scanner(System.in);
        while(true) {
            String name = sc.nextLine().trim();
            if (name.equalsIgnoreCase("END")) break;
            System.out.println(Capitalize(name));
        }
    }
}