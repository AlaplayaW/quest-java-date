import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();


        // TODO : your code after this line
        // Une date formatée de la façon suivante "month-day-year", ex : 04-22-2019Le jour de la semaine correspondant à la date, ex : 2

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

        Calendar c = new GregorianCalendar(year, month-1, day);
        Date d = c.getTime();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("The date is : " + sdf.format(d));
        System.out.println("The day of week is :" + dayOfWeek);

        }
}