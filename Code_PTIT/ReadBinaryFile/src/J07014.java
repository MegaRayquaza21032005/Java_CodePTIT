import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
import java.util.TreeSet;

// J07016
public class J07014 {
    public static boolean prime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); ++i) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        // doc object
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) obj1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) obj2.readObject();
        obj1.close();
        obj2.close();


        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        for(Integer x : arr1) {
            if(prime(x)) mp1.put(x, mp1.getOrDefault(x, 0) + 1);
        }
        for(Integer x : arr2) {
            if(prime(x)) mp2.put(x, mp2.getOrDefault(x, 0) + 1);
        }
        TreeSet<Integer> tr = new TreeSet<>(mp1.keySet());
        tr.retainAll(mp2.keySet());

        for(Integer x : tr) {
            System.out.println(x + " " + mp1.get(x) + " " + mp2.get(x));
        }
    }
}