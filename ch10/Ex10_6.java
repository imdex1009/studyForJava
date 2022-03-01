import java.util.Calendar;
import java.util.Date;

public class Ex10_6 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date d = new Date(cal.getTimeInMillis());
        System.out.println(d);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d);
        System.out.println(cal2);

    }
}
