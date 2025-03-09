package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("dt.get(ChronoField.MONTH_OF_YEAR) = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt = " + dt);
        System.out.println("dt.plusYears(10) = " + dt.plusYears(10));

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

    }
}
