import java.io.FileInputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("ReadBinaryFile/DATA.in");
        Scanner sc = new Scanner(fis);
        // while (sc.hasNextLine()) {
        //     System.out.println(sc.nextLine());
        // }
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
        fis.close();
    }
}
