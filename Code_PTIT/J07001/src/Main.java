import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}