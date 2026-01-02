import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


// parse: String --> LocalDateTime
// format:LocalDateTime --> String
public class DTFormatter {

    static final DateTimeFormatter DMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        System.out.println("Format ngày tháng năm: ");
        //    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate d = LocalDate.parse("8/5/2025", fmt);
        String s = d.format(DMY);
        System.out.println(s);

        System.out.println("______________________________________________________________________");
        System.out.println("Các thông tin cơ bản: ");
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
//        System.out.println(d.getHour());
//        System.out.println(d.getMinute());
//        System.out.println(d.getSecond());

        System.out.println("______________________________________________________________________");
        System.out.println("So sánh thời gian: ");
        LocalDate t1 = LocalDate.parse("21/11/2025", fmt);
        LocalDate t2 = LocalDate.parse("22/2/2026", fmt);
        System.out.println(t1.isAfter(t2));
        System.out.println(t1.isBefore(t2));
        System.out.println(t1.isEqual(t2));

        System.out.println("______________________________________________________________________");
        System.out.println("Cộng trừ thời gian: ");
        LocalDate t3 = LocalDate.parse("21/11/2025", fmt);
        s = (t3.plusDays(5)).format(DMY);
        System.out.println(s);
//        dt.plusDays(5)
//                .minusHours(2)
//                .plusMinutes(30);
        s = (t3.plusDays(-5)).format(DMY);
        System.out.println(s);

        System.out.println("______________________________________________________________________");
        System.out.println("Chênh lệch thời gian: ");
        LocalDate t4 = LocalDate.parse("21/11/2025", fmt);
        LocalDate t5 = LocalDate.parse("22/2/2026", fmt);
        long days = ChronoUnit.DAYS.between(t4, t5);
//        long hours   = ChronoUnit.HOURS.between(t4, t5);
//        long minutes = ChronoUnit.MINUTES.between(t4, t5);
        System.out.println("Days: " + days);
//        System.out.println("Duration Days: " + Duration.between(t1, t2).toHours()); // chỉ dùng cho LocalDateTime
    }
}
