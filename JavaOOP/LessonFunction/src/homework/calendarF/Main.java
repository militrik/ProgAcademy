package homework.calendarF;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Calendar, Integer> fun = calendar -> calendar.get(Calendar.YEAR);
        System.out.println(fun.apply(new GregorianCalendar()));
    }
}
