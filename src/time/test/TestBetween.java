package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2024, 11, 21);

        Period period = Period.between(start, end);
        System.out.println("period.getYears() = " + period.getYears());
        System.out.println("period.getYears() = " + period.getMonths());
        long between = ChronoUnit.DAYS.between(start, end);
        System.out.println("between = " + between);
    }
}
