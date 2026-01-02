import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;
import java.io.*;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tl = new ArrayList<>();
        ArrayList<Phim> phim = new ArrayList<>();
        int num_tl = sc.nextInt();
        int num_film = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < num_tl; ++i) {
            String tmp = sc.nextLine();
            tl.add(tmp);
        }
        for(int i = 0; i < num_film; ++i) {
            String the_loai = sc.nextLine();
            String date = sc.nextLine();
            String name = sc.nextLine();
            int num_eps = sc.nextInt();
            sc.nextLine();
            the_loai = the_loai.substring(2);
            the_loai = tl.get(Integer.parseInt(the_loai) - 1);
            phim.add(new Phim(i + 1, the_loai, date, name, num_eps));
        }
        Collections.sort(phim);
        for(Phim p : phim) {
            System.out.println(p);
        }
    }
}