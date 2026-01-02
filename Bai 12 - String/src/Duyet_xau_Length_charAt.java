import java.util.Scanner;

public class Duyet_xau_Length_charAt {
    public static void main(String[] args) {
        String name = "Nguyen Thanh Dat";

        for(int i = 0; i < name.length(); ++i)
        {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        for(char x : name.toCharArray())
        {
            System.out.print(x + ' ');
        }
    }
}
