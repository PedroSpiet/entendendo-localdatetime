import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        LocalDateTime timeOne = LocalDateTime.now();
        LocalDateTime timeTwo = LocalDateTime.now();

        boolean isBefore = timeOne.isBefore(timeTwo);
        boolean isAfter = timeOne.isAfter(timeTwo);
        boolean isEqual = timeOne.isEqual(timeTwo);

        int compareValue = timeOne.compareTo(timeTwo);


        System.out.println("1 " + timeOne);
        System.out.println("2 " + timeTwo);

        if (timeOne.getYear() == timeTwo.getYear() && timeOne.getMonth() == timeTwo.getMonth() &&
                timeOne.getDayOfMonth() == timeTwo.getDayOfMonth() && timeOne.getHour() == timeTwo.getHour()
                && timeOne.getMinute() == timeTwo.getMinute()) {
            System.out.println("Igualzinho fí");
        }

        System.out.println("Time One is before Time Two? " + isBefore);
        System.out.println("Time One is After time Two? " + isAfter);
        System.out.println("Time One is equal time Two? " + isEqual);
    }
}
