import java.util.Calendar;
import java.util.Date;

public class Ex10_4 {
    public static void main(String[] args) {

        Calendar dt = Calendar.getInstance();

        // Tue Mar 01 19:31:23 KST 2022
        System.out.println(new Date(dt.getTimeInMillis()));

        dt.clear(Calendar.SECOND);
        dt.clear(Calendar.MINUTE);
        dt.clear(Calendar.HOUR_OF_DAY);
        dt.clear(Calendar.HOUR);


        // Tue Mar 01 12:00:00 KST 2022
        System.out.println(new Date(dt.getTimeInMillis()));


    }
}
