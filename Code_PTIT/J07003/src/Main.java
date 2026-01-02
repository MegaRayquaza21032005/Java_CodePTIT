import java.util.Scanner;
import java.io.*;

public class Main {
    public static boolean calcu(String s) {
        if (s.length() > 9) return false;
        for(int i = 0; i < s.length(); ++i) {
            if(Character.isLetter(s.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
//        Scanner sc = new Scanner(System.in);
        long sum = 0;
        while(sc.hasNext()) {
            String s = sc.next();
            if(calcu(s)) sum += Long.parseLong(s);
        }
        System.out.println("Liệt kê các số tăng dần, ví dụ:");
        System.out.println(sum);
    }
}