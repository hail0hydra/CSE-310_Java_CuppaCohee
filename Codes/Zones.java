import java.time.*;

public class Zones{
    public static void main(String...args){
        LocalTime t1 = LocalTime.now(ZoneId.of("Asia/Dubai"));
        LocalTime t2 = LocalTime.now(ZoneId.of("America/Denver"));

        System.out.println("Time in Dubai: "+ t1 + "\nTime in Denver: " + t2);

        // System.out.println(ZoneId.getAvailableZoneIds());

        LocalDate d = LocalDate.now();
        
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfYear());
        System.out.println(d.getDayOfWeek());
        System.out.println(d.isLeapYear());

    }
}
