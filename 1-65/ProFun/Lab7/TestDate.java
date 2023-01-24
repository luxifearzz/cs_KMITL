import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class TestDate {
    public static void main(String[] args) {
        LocalDate jan3yr04 = LocalDate.of(2004, 1, 3);
        LocalDate jan2yr22 = LocalDate.of(2022, 1, 2);

        long daysBetween;
        daysBetween = ChronoUnit.DAYS.between(jan3yr04, jan2yr22);
        System.out.println(jan3yr04 + " was " + jan3yr04.getDayOfWeek() + ". It is " + daysBetween + " days to Sunday 2022 01 02");
    }
}