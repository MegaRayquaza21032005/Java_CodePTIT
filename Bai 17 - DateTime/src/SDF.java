import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SDF {
    public static void main(String[] args) throws Exception {
//        SimpleDateFormat sdfIn = new SimpleDateFormat("d/m/YYYY");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String s = "5/5/2025";
        Date date = sdf.parse(s);
        s = sdf.format(date);
        System.out.println("Đúng định dạng: " + s);


        System.out.println("______________________________________________________________________");
        System.out.println("Độ chênh lệch thời gian: ");
        Date start = sdf.parse("5/5/2025");
        Date end = sdf.parse("10/6/2025");
        long diffMillis = end.getTime() - start.getTime();
        System.out.println("Theo giây: " + diffMillis);
        System.out.println("Theo ngày: " + TimeUnit.MILLISECONDS.toDays(diffMillis));
        System.out.println("Theo giờ: " + TimeUnit.MILLISECONDS.toHours(diffMillis));
    }
}