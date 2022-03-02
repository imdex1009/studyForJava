import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prac10_4 {
    public static void main(String[] args) {
        String birthDay = "2000-01-01";
        String today = "2016-01-29";

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = df.parse(birthDay);
            Date d2 = df.parse(today);

            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.clear();
            cal2.clear();

            cal1.setTime(d1);
            cal2.setTime(d2);

            long days = ((cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000) / (24 * 60 * 60);
            System.out.println("birthday=" + birthDay);
            System.out.println("today=" + today);
            System.out.println(days + " days");


        } catch(ParseException e) {

        }


//        System.out.println(d1);
//        System.out.println(d2);



    }

    static void checkOutDate(Calendar cal) {
        System.out.printf("year: %d | month: %d | day: %d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
    }
}
