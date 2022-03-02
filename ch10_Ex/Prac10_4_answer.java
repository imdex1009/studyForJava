import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prac10_4_answer {
    public static void main(String[] args) {
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2000, 0, 1);
        date2.set(2016, 0, 29);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("birth day=" + df.format(new Date(date1.getTimeInMillis())));
        System.out.println("today=" + df.format(new Date(date2.getTimeInMillis())));

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
        System.out.println(difference/(24 * 60 * 60) + " days");
    }
}
