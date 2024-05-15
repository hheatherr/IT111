import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates {


    public static void main(String[] args) {
        //keep it simple, let's display the current date
        LocalDate currentDate = LocalDate.now();
        //currentDate is a variable,LocalDate.now() is the object
        System.out.println(currentDate);
        //don't like- i'd like to see the month, day of the week and the year

        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);

        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

        //the year would have to be an integer, so we will declare the data type

        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

        //we'd like to know the number of the day - if today is the 8th of the month - 8

        int currentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentDayNumber);

        System.out.println("Today is "+currentDay+ ", "+currentMonth+ " "+currentDayNumber+ "th, " +currentYear+ "!");
    }
}
