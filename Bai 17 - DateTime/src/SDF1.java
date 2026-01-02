import java.text.SimpleDateFormat;
import java.util.Date;

public class SDF1 {
    public static void main(String[] args) throws Exception {
        String input = "5/5/2025";

        // SimpleDateFormat tự động hiểu "d/M" là có thể chấp nhận cả "5/5" và "05/05"
        SimpleDateFormat sdfInput = new SimpleDateFormat("d/M/yyyy");
        SimpleDateFormat sdfOutput = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sdfInput.parse(input);
        String result = sdfOutput.format(date);

        System.out.println("Kết quả: " + result); // Output: 05/05/2025
    }
}