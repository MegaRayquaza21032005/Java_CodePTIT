import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) in.readObject();

        for (String s : list) {
            StringBuilder bin = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0' || c == '1') {
                    bin.append(c);
                }
            }
            String binaryString = bin.toString();
            long value = 0;
            if (!binaryString.isEmpty()) {
                value = Long.parseLong(binaryString, 2);
            }
            System.out.println(binaryString + " " + value);
        }
    }
}