import java.time.LocalDate;
import java.time.Month;

public class Lion {
    public static void main(String[] args) {
        var date = LocalDate.of(2025, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth()
                + " " + date.getDayOfMonth());
    }
}